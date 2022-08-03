package org.fundacionview.sgsst.repositorios;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.fundacionview.sgsst.modelos.Ausentismo;
import org.fundacionview.sgsst.modelos.Empleado.AreasEmpresa;
import org.fundacionview.sgsst.modelos.ReporteCuentas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAusentismos extends JpaRepository<Ausentismo, Integer>{

	
	public List<Ausentismo> findByAreaTrabajo(AreasEmpresa areaTrabajo);
	
	
	@Query(value="SELECT *FROM tbl_ausentismos WHERE area_trabajo=:areaT",nativeQuery = true)
	public List<Ausentismo> buscarPorArea(@Param("areaT")AreasEmpresa areaT);
	
	
	public List<Ausentismo> findByTipoIncapacidad(String tipoIncapacidad);
	
	@Query(value = "SELECT sum(asumido_empresa) as totaEmpresa,sum(totaleps) as totalEps,sum(total_pensiones) as totalPensiones,sum(totalarl) as totalArl FROM tbl_ausentismos WHERE fecha_reg BETWEEN :fechaIn AND :fechaFin", nativeQuery = true)
	public List<Map<String,Double>> consultaCuentas(@Param("fechaIn")Date fechaIn,@Param("fechaFin")Date fechaFin);
	
	
	public List<Ausentismo> findByNumDoc(Long numDoc);
	
	
}
