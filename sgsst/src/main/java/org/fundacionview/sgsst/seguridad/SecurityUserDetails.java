package org.fundacionview.sgsst.seguridad;

import org.fundacionview.sgsst.modelos.Roles;
import org.springframework.security.core.authority.AuthorityUtils;

public class SecurityUserDetails extends org.springframework.security.core.userdetails.User{

	private int id;
	private Roles roles;
	
	
	public SecurityUserDetails(int id,String userName,String password,Roles roles) {
        super(userName,password, AuthorityUtils.createAuthorityList(roles.getRoleName()));
        this.id = id;
        this.roles = roles;
    }
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	
	
	
	
}
