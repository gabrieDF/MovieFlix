package br.com.MovieFlix.controller;

import org.hibernate.annotations.OnDelete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import br.com.MovieFlix.beans.Perfis;
import br.com.MovieFlix.dao.PerfisDAO;
import net.bytebuddy.build.ToStringPlugin.Exclude;

@Controller
public class PerfisController {

	@Autowired
	private PerfisDAO dao;
	

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/cadastro")
	public String cadastro() {
		return "cadastro";
	}
	
	

	@GetMapping("/teste")
	public String test() {
		return "<h2> asdasdasdas </h2>";
	}


	@PostMapping("/login")
	public ResponseEntity<Perfis> getAllByEmailAndSenha(@RequestBody Perfis perfis) {
		System.out.println(perfis);
		System.out.println("Email: " + perfis.getEmail());
		System.out.println("Senha: " + perfis.getSenha());
		Perfis resposta = dao.findByEmailAndSenha(perfis.getEmail(), perfis.getSenha());

//		if(resposta == null) { return ResponseEntity.status(404).build();}
		System.out.println(resposta);
		return ResponseEntity.ok(resposta);
	}

	@GetMapping("/usuarios")
	public ResponseEntity<List<Perfis>> getAll() {
		List<Perfis> list = (List<Perfis>) dao.findAll();

		if (list.size() == 0) {
			return ResponseEntity.status(404).build();
		}

		return ResponseEntity.ok(list);

	}

	@GetMapping("/usuarios/{userId}")
	public ResponseEntity<Perfis> getAllById(@PathVariable("userId") int id) {
		Perfis listId = dao.findById(id).orElse(null);

		if (listId == null) {
			return ResponseEntity.status(404).build();
		}

		return ResponseEntity.ok(listId);
	}

	@PostMapping("/cadObjeto")
	public ResponseEntity<Perfis> getSave(@RequestBody Perfis perfis) {
		try {
			dao.save(perfis);
			return ResponseEntity.ok(perfis);

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(404).build();
		}
	}

	@PostMapping("/loginPostman")
	public ResponseEntity<Perfis> getAllEmailAndSenha1(@RequestBody Perfis perfis) {
		Perfis resposta = dao.findByEmailAndSenha(perfis.getEmail(), perfis.getSenha());

		if (resposta == null) {
			return ResponseEntity.status(404).build();
		}
		System.out.println(resposta);
		return ResponseEntity.ok(resposta);
	}
	
	@DeleteMapping("/delete")
	public void deleteUsuario(@RequestBody Perfis perfis) {
		dao.delete(perfis);

	}

	
	@PutMapping("/atualiza")
	public Perfis atualizaUsuario(@RequestBody Perfis perfis) {
		return dao.save(perfis);
	}
	
	
	
	
	
	
}