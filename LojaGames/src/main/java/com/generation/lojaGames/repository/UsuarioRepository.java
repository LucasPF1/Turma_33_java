package com.generation.lojaGames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojaGames.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsuario(String usuario);

	/**
	 * Método criado para a sessão de testes
	 */
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

	/**
	 * Método criado para a sessão de testes
	 */
	public Usuario findByNome(String nome);

}