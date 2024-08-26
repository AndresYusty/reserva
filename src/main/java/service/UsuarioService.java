package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Usuario;
import repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository UsuarioRepository;
	
	public Usuario crearUsuario(Usuario usuario) {
		return UsuarioRepository.save(usuario);
	}
	
	public List<Usuario> ObtenerTodosLosUsuarios() {
		return UsuarioRepository.findAll();
	}
	
	public  Optional<Usuario> ObtenerUsuarioPorId (Long id) {
		return UsuarioRepository.findById(id);
	}
	
	

}
