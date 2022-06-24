package org.fundacionview.jpa_base_datos.repositorios;

import java.util.ArrayList;

import org.fundacionview.jpa_base_datos.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUser extends JpaRepository<Usuario, Integer>{
	
	
	@Query("FROM Usuario where edad>=20")
	public ArrayList<Usuario> getMayores();
	
	// Operadores logicos  AND   OR  NOT
	
	
	@Query("FROM Usuario u where u.email=:nom  AND u.clave=:pass")
	public Usuario login(@Param("nom")String nom,@Param("pass")String pass) ;
	
	
	//Operadores de comparacion 
	// > Mayor que
	// < Menor que
	// >= Mayor o igual que
	// <= Menor o igual que
	// <>  =! Diferente de.
	// between 
	
	
	@Query("FROM Usuario a where a.edad BETWEEN 18 AND 30")
	public ArrayList<Usuario> betweenEdad();
	
	
	// Operadores aritmeticos 
	// + - * /
	
	
	// Funciones de agregacion 
	// AVG() Promedio de los valores evaluados
	// SUM() Suma los datos en cuestion
	// MIN() MAX() Valores maximo y minimo de los registros.
	// COUNT()  Contador de registros.
	// SQRT()  Raiz cuadrada de un valor dado.
	
	
	@Query("SELECT AVG(edad) FROM Usuario")
	public Double getPromedioEdad();
	 
	

}
