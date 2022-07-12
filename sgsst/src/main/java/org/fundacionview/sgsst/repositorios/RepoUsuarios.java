package org.fundacionview.sgsst.repositorios;

import java.util.ArrayList;

import org.fundacionview.sgsst.modelos.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoUsuarios extends JpaRepository<Empleado, Integer>{

	
	@Query(value = "SELECT *FROM tbl_empleado limit 1",nativeQuery = true)
	public Empleado consultaNativa();
	
	
	@Query(value = "FROM Empleado WHERE nombre LIKE %:texto% OR id_user LIKE %:texto%")
	public ArrayList<Empleado> listarEmpleadByName(@Param("texto")String texto);
	
	
}
