package org.fundacionview.sgsst.repositorios;

import org.fundacionview.sgsst.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepoUser extends JpaRepository<Usuario, Integer>{

	
	@Query("FROM Usuario where username=:username and clave=:clave")
	public Usuario loginUser(@Param("username")String username,@Param("clave")String clave);
	
}
