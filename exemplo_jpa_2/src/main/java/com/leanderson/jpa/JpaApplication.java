package com.leanderson.jpa;

import com.leanderson.jpa.entidade.Perfil;
import com.leanderson.jpa.entidade.Usuario;
import com.leanderson.jpa.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class JpaApplication implements ApplicationRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Aplicação iniciada...");


		Usuario usuario = new Usuario();
		usuario.setNomeCompleto("João Silva");
		usuario.setEmail("joao@email.com");
		usuario.setNomeUsuario("joaosilva");
		usuario.setSenha("123456");


		Perfil perfil = new Perfil();
		perfil.setFotoPerfil("foto.jpg");
		perfil.setIdiomaPreferido("pt-BR");
		perfil.setTema("escuro");
		perfil.setUsuario(usuario);
		usuario.setPerfil(perfil);


		Optional<Usuario> existente = usuarioRepository.findByEmail("joao@email.com");
		if (existente.isPresent()) {
			System.out.println("Usuário já existente: " + existente.get().getNomeCompleto());
		} else {
			usuarioRepository.save(usuario);
			System.out.println("Novo usuário salvo: " + usuario.getNomeCompleto());
		}


		System.out.println("--- Lista de usuários ordenados ---");
		for (Usuario u : usuarioRepository.findAllByOrderByNomeCompletoAsc()) {
			System.out.println(u.getNomeCompleto() + " - " + u.getEmail());
		}
	}
}