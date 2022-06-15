package org.fundacionview.jpa_base_datos.repositorios;

import org.fundacionview.jpa_base_datos.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUser extends JpaRepository<Usuario, Integer>{
	
	

}
