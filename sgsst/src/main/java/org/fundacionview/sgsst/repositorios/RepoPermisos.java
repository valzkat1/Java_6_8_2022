package org.fundacionview.sgsst.repositorios;

import java.util.ArrayList;

import org.fundacionview.sgsst.modelos.Permisos;
import org.fundacionview.sgsst.modelos.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoPermisos extends JpaRepository<Permisos, Integer>{
	
	public ArrayList<Permisos> findByRolesAndWorkspaceIn(Roles roles,String... workspace);

}
