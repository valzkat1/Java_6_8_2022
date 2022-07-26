package org.fundacionview.sgsst.seguridad;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.function.Function;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.fundacionview.sgsst.modelos.Permisos;
import org.fundacionview.sgsst.repositorios.RepoPermisos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PermissionAspect {


    @Autowired
    private RepoPermisos permissionRepository;

    @Around("execution(@org.fundacionview.sgsst.seguridad.PermissionCheck * *(..)) && @annotation(permissionCheck)")
    public Object doSomething(ProceedingJoinPoint pjp, PermissionCheck permissionCheck) throws Throwable {
        if(permissionCheck.workspace().length>0
                && SecurityUtil.getUser()!=null){
           List<Permisos> permissionList = permissionRepository.findByRolesAndWorkspaceIn(
                    SecurityUtil.getUser().getRoles(),permissionCheck.workspace());


           Function<Permisos,Boolean> permissionFunction = new Function<Permisos, Boolean>() {
               @Override
               public Boolean apply(Permisos permissionEntity) {
                   if(permissionCheck.read() && permissionEntity.getRead()) {
                       return true;
                   }
                   if(permissionCheck.write() && permissionEntity.getWrite()) {
                       return true;
                   }
                   if(permissionCheck.delete() && permissionEntity.getDelete()) {
                       return true;
                   }
                   return false;
               }
           };

           final boolean[] hasPermission = {false};
           permissionList.forEach(permissionEntity -> {
               hasPermission[0] = permissionFunction.apply(permissionEntity);
               if(hasPermission[0]){
                   return;
               }
           });

            if(!hasPermission[0]){
            	return null;
                //throw new AccessDeniedException("Do not has permission");
            }

        }
        return pjp.proceed();
    }
	
	
}
