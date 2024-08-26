package model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Reserva {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="usuario_id", nullable =false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="vuelo_id", nullable = false)
	private vuelo vuelo;
	
	@ManyToOne
	@JoinColumn(name="tiquete_id" , nullable = false)
	private Tiquete tiquete;
	
	@Column(name="ciudad_destino" , nullable = false)
	private String ciudad_destino;
	
	@Column(name="fecha_reserva", nullable = false)
	private LocalDateTime fecha_reserva;

}
