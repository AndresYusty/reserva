package model;

import java.math.BigDecimal;
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
public class Tiquete {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="codigo_tiquete")
	private String codigo_tiquete;
	
	@Column(name="clase")
	private String clase;
	
	@Column(name="precio")
	private BigDecimal precio;
	
	@Column(name="fecha_emision")
	private LocalDateTime fechaEmision;
	
    @OneToMany
	 private List<Reserva> reservas;

}
