package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Reserva;
import model.Usuario;
import repository.ReservaRepository;
import repository.TiqueteRepository;
import repository.VueloRepository;
import repository.UsuarioRepository;

@Service
public class ReservaService {
	
	@Autowired
	private ReservaRepository ReservaRepository;
	
	@Autowired
	private TiqueteRepository TiqueteRepository;
	
	@Autowired
	private UsuarioRepository UsuarioRepository;
	
	@Autowired
	private VueloRepository VueloRepository;
	
/*	public Reserva crearReserva(Reserva reserva) {
		Usuario usuario = UsuarioRepository.findById(reserva.getUsuario().getId());
	}*/
	
	
	
	

}
