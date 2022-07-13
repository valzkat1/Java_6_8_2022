package org.fundacionview.sgsst.repositorios;

import java.util.ArrayList;

import org.fundacionview.sgsst.modelos.CIE10;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoCie10 extends JpaRepository<CIE10, Integer>{

	
	@Query("FROM CIE10 where LOWER(codigo) LIKE %:codig%  OR LOWER(diagnostico) LIKE %:codig% ")
	public ArrayList<CIE10> autocompleteDiagnosticos(@Param("codig")String codig);
	
	
}
