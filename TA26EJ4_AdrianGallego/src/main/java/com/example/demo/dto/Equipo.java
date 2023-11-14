package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="equipos")
public class Equipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num_serie;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="codigo_facultad")
	private Facultad facultad;

	public Equipo() {
		
	}

	public Equipo(int num_serie, String nombre, Facultad facultad) {
		this.num_serie = num_serie;
		this.nombre = nombre;
		this.facultad = facultad;
	}

	public int getNum_serie() {
		return num_serie;
	}

	public void setNum_serie(int num_serie) {
		this.num_serie = num_serie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

}
