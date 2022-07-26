package org.fundacionview.sgsst.repositorios;

import java.util.Optional;

import org.fundacionview.sgsst.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepoUser extends JpaRepository<Usuario, Integer>{

	
	@Query("FROM Usuario where username=:username and clave=:clave")
	public Usuario loginUser(@Param("username")String username,@Param("clave")String clave);
	
	
	@Query(value="SELECT *FROM Usuario where id_empleado=:id_empleado limit 1",nativeQuery =true)
	public Usuario ComprobarCrearUser(@Param("id_empleado")int id_empleado);
	
	
	//@Query(value = "FROM Usuario WHERE username=:usernam")
	//public Optional<Usuario> buscarPorUserName(@Param("usernam")String usernam);
	
	
	public Optional<Usuario> findByUsername(String username);
	
	
	
}
