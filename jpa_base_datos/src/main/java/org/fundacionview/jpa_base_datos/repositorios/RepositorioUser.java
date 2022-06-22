package org.fundacionview.jpa_base_datos.repositorios;

import java.util.ArrayList;

import org.fundacionview.jpa_base_datos.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUser extends JpaRepository<Usuario, Integer>{
	
	
	@Query("FROM Usuario where edad>=20")
	public ArrayList<Usuario> getMayores();
	
	

}
