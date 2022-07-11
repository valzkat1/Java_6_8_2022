package org.fundacionview.sgsst.modelos;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
	
	@Size(min = 5)
	private String username;
	
	@Size(min=6)
	private String clave;	


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_empleado",referencedColumnName = "id")
	private Empleado unoAuno;
	
	//private int id_empleado;


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


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
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
