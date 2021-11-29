package br.com.MovieFlix.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.MovieFlix.beans.Perfis;
import br.com.MovieFlix.beans.Perfis;

public interface PerfisDAO extends CrudRepository<Perfis, Integer>{
	public Perfis findByEmailAndSenha(String email, int senha);
}
