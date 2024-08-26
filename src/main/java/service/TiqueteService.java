package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Tiquete;
import repository.TiqueteRepository;

@Service
public class TiqueteService {
	
	@Autowired
	private TiqueteRepository TiqueteRepository;
	
	public Tiquete crearTiquete(Tiquete tiquete){
		return TiqueteRepository.save(tiquete);
	}
	
	public Optional<Tiquete> ObtenerTiquetePorId(Long id) {
		return TiqueteRepository.findById(id);
	}
	
	
}
