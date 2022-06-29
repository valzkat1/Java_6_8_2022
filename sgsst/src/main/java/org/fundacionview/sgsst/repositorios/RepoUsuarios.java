package org.fundacionview.sgsst.repositorios;

import org.fundacionview.sgsst.modelos.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoUsuarios extends JpaRepository<Empleado, Integer>{

	
	@Query(value = "SELECT *FROM tbl_empleado limit 1",nativeQuery = true)
	public Empleado consultaNativa();
	
	
}
