package org.fundacionview.sgsst.repositorios;

import java.util.ArrayList;

import org.fundacionview.sgsst.modelos.Permisos;
import org.fundacionview.sgsst.modelos.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoPermisos extends JpaRepository<Permisos, Integer>{
	
	public ArrayList<Permisos> findByRolesAndWorkspaceIn(Roles roles,String... workspace);

	
	@Query(value = "SELECT *FROM tbl_permisos WHERE workspace=:modulo AND roles=:rol",nativeQuery = true)
	public Permisos consultaRolPermisos(@Param("rol")String rol,@Param("modulo")String modulo);
	
}
