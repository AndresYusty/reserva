package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.vuelo;
import service.VueloService;

@RestController
@RequestMapping("airline/vuelos")
public class VueloController {

	@Autowired
	private VueloService vueloService;
	
	@PostMapping
	public ResponseEntity<vuelo> crearVuelo(@RequestBody vuelo vuelo){
		vuelo nuevoVuelo= vueloService.CrearVuelo(vuelo);
		return new ResponseEntity<>(nuevoVuelo, HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<vuelo> ObtenerTodosLosVuelos(){
		return vueloService.ObtenerTodosLosVuelos(); 
	}
	
/*	@GetMapping("/{id}")
	public ResponseEntity <vuelo> ObtenerVueloPorId(@PathVariable Long id){
		vuelo vuelo = vueloService.ObtenerVueloPorId(id);
		return ResponseEntity.ok(vuelo);
		
	} */
	
	
}
