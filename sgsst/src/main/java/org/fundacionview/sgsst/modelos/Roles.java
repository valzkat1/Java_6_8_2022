package org.fundacionview.sgsst.modelos;

public enum Roles {

	Admin("ROLE_ADMIN"),
	Auxiliar("ROLE_AUXILIAR"),
	Consultas("ROLE_CONSULTAS");
	
	private String nombreRol;
	
	Roles(String rolename){
		this.nombreRol=rolename;
	}
	
	public String getRoleName() {
		return this.nombreRol;
	}
	
}
