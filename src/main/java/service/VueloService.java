package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.vuelo;
import repository.VueloRepository;

@Service
public class VueloService {
	
	@Autowired
	private VueloRepository VueloRepository;
	
	public vuelo CrearVuelo(vuelo vuelo) {
		return VueloRepository.save(vuelo);
		
	}
	
	public List <vuelo> ObtenerTodosLosVuelos() {
		return VueloRepository.findAll();
		
	}
	
	public Optional<vuelo> ObtenerVueloPorId (Long id) {
		return VueloRepository.findById(id);
		
	}


}
