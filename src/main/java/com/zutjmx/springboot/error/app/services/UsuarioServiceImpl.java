package com.zutjmx.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zutjmx.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;
	
	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1,"Ana","Alejandre"));
		this.lista.add(new Usuario(2,"Yesmeli","Castellanos"));
		this.lista.add(new Usuario(3,"Yulinet","Lezcano"));
		this.lista.add(new Usuario(4,"Ada","Lovelace"));
		this.lista.add(new Usuario(5,"Rebeca","Melendez"));
		this.lista.add(new Usuario(6,"Marisol","Barragan"));
		this.lista.add(new Usuario(7,"Veronica","Campuzano"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		
		Usuario resultado = null;
		
		for (Usuario usuario : lista) {
			if (usuario.getId().equals(id)) {
				resultado = usuario;
				break;
			}
		}
		
		return resultado;
		
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}

}
