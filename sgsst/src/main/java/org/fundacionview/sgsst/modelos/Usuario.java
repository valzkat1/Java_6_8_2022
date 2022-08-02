package org.fundacionview.sgsst.modelos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min = 5,message = "Minimo 5 caracteres")
	@Column(unique = true)
	private String username;
	
	@Size(min=6)
	private String password;	


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_empleado",referencedColumnName = "id")
	private Empleado unoAuno;
	
	//private int id_empleado;

	@Enumerated(EnumType.STRING)
	private Roles roles;
	
	

	public Roles getRoles() {
		return roles;
	}


	public void setRoles(Roles roles) {
		this.roles = roles;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Empleado getUnoAuno() {
		return unoAuno;
	}


	public void setUnoAuno(Empleado unoAuno) {
		this.unoAuno = unoAuno;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String clave) {
		this.password = clave;
	}


//	public int getId_empleado() {
//		return id_empleado;
//	}


	//public void setId_empleado(int id_empleado) {
	//	this.id_empleado = id_empleado;
	//}


	public Usuario() {
		super();
	}
	
	
	
	
	
	
}
