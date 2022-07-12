package org.fundacionview.sgsst.modelos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_empleado")
public class Empleado {

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", id_user=" + id_user + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", email=" + email + ", tipoID=" + tipoID + ", salario=" + salario + ", cargo=" + cargo + ", eps="
				+ eps + ", afp=" + afp + ", arl=" + arl + ", areaEmpleado=" + areaEmpleado + ", fechaNacimiento="
				+ fechaNacimiento + ", genero=" + genero + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", areas=" + areas + "]";
	}

	public enum AreasEmpresa{
		ADMINISTRACION, SISTEMAS, OFICIOS, BRIGADA
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Min(value = 1000000,message = "Solo numeros de cedula validos",groups = {CamposGeneral.class})
	private long id_user;
	
	@NotEmpty(message = "Campo necesario",groups = {CamposGeneral.class})
	private String nombre;
	
	@NotEmpty(message = "Campo necesario",groups = {CamposGeneral.class})
	private String apellidos;
	
	//@NotEmpty(message = "Campo necesario" ,groups = {CamposGeneral.class,CamposLogin.class})
	//@Email(groups = {CamposGeneral.class,CamposLogin.class})
	private String email;
	
	private String tipoID;
	

	@Min(value = 1000000,message = "SMV no es inferior a 1 millon",groups = {CamposGeneral.class})
	private int salario;
	
	private String cargo;
	
	private String eps;
	
	private String afp;
	
	private String arl;
	
	private AreasEmpresa areaEmpleado;
	
	
	private Date fechaNacimiento;
	
	
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public AreasEmpresa getAreaEmpleado() {
		return areaEmpleado;
	}

	public void setAreaEmpleado(AreasEmpresa areaEmpleado) {
		this.areaEmpleado = areaEmpleado;
	}

	public String getTipoID() {
		return tipoID;
	}

	public void setTipoID(String tipoID) {
		this.tipoID = tipoID;
	}



	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getArl() {
		return arl;
	}

	public void setArl(String arl) {
		this.arl = arl;
	}

//	@NotEmpty(message = "Campo necesario",groups = {CamposGeneral.class,CamposLogin.class})
//	@Size(min = 6,message = "Minimo 6 caracteres",groups = {CamposLogin.class})
//	private String clave;
	
	private String genero;	
	
	private String direccion;
	
	private String telefono;

	@Enumerated(EnumType.ORDINAL)
	private AreasEmpresa areas;
	
	
	
	public AreasEmpresa getAreas() {
		return areas;
	}

	public void setAreas(AreasEmpresa areas) {
		this.areas = areas;
	}

	public Empleado() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getId_user() {
		return id_user;
	}

	public void setId_user(long id_user) {
		this.id_user = id_user;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * public String getClave() { return clave; }
	 * 
	 * public void setClave(String clave) { this.clave = clave; }
	 */
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
}
