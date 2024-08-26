package model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class vuelo {
	
	@Id
	@GeneratedValue()
	private Long id;
	
	@Column(name= "numero_vuelo" ,nullable = false)
	private String numeroVuelo;
	
	@Column(name= "origen" ,nullable = false)
	private String origen;
	
	@Column(name= "destino" ,nullable = false)
	private String destino;
	
	@Column(name= "fecha_salida", nullable = false)
	private LocalDateTime fecha_salida;
	
	@Column(name= "fecha_llegada", nullable = false)
	private LocalDateTime fecha_llegada;
	
    @OneToMany
	 private List<Reserva> reservas;


}
