package com.fseiji.pontointeligente.api.services;

import java.util.Optional;

import com.fseiji.pontointeligente.api.entities.Usuario;

public interface UsuarioService {

	/**
	 * Busca e retorna um usuário dado um email.
	 *
	 * @param email
	 * @return Optional<Usuario>
	 */
	Optional<Usuario> buscarPorEmail(String email);
}
