package org.fundacionview.sgsst.seguridad;

import java.util.Optional;

import org.fundacionview.sgsst.modelos.Usuario;
import org.fundacionview.sgsst.repositorios.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SecurityUserDetailsService implements UserDetailsService {

	
	@Autowired
	private RepoUser repoUse;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<Usuario> optional= repoUse.findByUsername(username);
		
		if(optional.isPresent()) {
			Usuario user= optional.get();
			return new SecurityUserDetails(user.getId(), user.getUsername(), user.getPassword(), user.getRoles());
		}
		
		return null;
	}

}
