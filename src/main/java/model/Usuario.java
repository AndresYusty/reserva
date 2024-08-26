package model;

import java.sql.Timestamp;

import org.hibernate.mapping.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue()
	private Long id;
	
	@Column(name= "nombre", nullable = false, length = 30)
	private String nombre;
	
	@Column(name= "apellido", nullable = false, length = 30)
	private String apellido;
	
	@Column(name= "email", nullable = false, length = 30)
	private String email;
	
	@Column(name= "fecha_Creacion", nullable= false)
	private Timestamp fecha_Creacion;
	
   @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	 private List<Reserva> reservas;

}
