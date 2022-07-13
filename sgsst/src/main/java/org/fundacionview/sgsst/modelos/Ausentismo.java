package org.fundacionview.sgsst.modelos;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "tbl_ausentismos")
public class Ausentismo {

	@Id
	private int id;
	
	
	public Ausentismo() {
		super();
	}

	// Info Empleado
	@NotEmpty
	@NotBlank
	private String nombre;
	private String apellidos;
	private String tipoDoc;
	private String numDoc;
	
	@NotEmpty(message = "Campo necesario")
	private String cargo;
	@NotEmpty(message = "Campo necesario")
	private String EPS;
	
	private int salario;
	private double salarioDia;
	
	// Info Incapacidad
	@NotEmpty(message = "Campo necesario")
	private String tipoIncapacidad;	
	@NotEmpty(message = "Campo necesario")
	private Date fechaInicio;
	@NotEmpty(message = "Campo necesario")
	private Date fechaFin;
	private int totalDias;
	@NotEmpty(message = "Campo necesario")
	private String clasificacion;

	//CIE10
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_diagnostic",referencedColumnName = "id")
	private CIE10 diagnostico;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public String getTipoIncapacidad() {
		return tipoIncapacidad;
	}

	public void setTipoIncapacidad(String tipoIncapacidad) {
		this.tipoIncapacidad = tipoIncapacidad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEPS() {
		return EPS;
	}

	public void setEPS(String ePS) {
		EPS = ePS;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public double getSalarioDia() {
		return salarioDia;
	}

	public void setSalarioDia(double salarioDia) {
		this.salarioDia = salarioDia;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getTotalDias() {
		return totalDias;
	}

	public void setTotalDias(int totalDias) {
		this.totalDias = totalDias;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public CIE10 getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(CIE10 diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	
	
	
	
}
