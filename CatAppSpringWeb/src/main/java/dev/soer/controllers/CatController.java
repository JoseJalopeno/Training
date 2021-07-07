package dev.soer.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.soer.beans.Cat;
import dev.soer.services.CatServiceImpl;

@RestController
@RequestMapping("/cats")
// @CrossOrigin()
public class CatController {
	
	private CatServiceImpl catServ;
	
	@Autowired
	public CatController(CatServiceImpl catServ) {
		this.catServ = catServ;
	}
	
//	@RequestMapping(method=RequestMethod.GET, path="/cats")
//	public ResponseEntity<List<Cat>> getAllCats() {
//		
//	}
	
	// http://localhost:8080/CatAppSpringWeb/cats
	
	@GetMapping()
	public ResponseEntity<List<Cat>> getAllCats() {
		List<Cat> cats = catServ.getAllCats();
		return ResponseEntity.ok(cats);
	}
	
	// http://localhost:8080/CatAppSpringWeb/cats/10
	
	@GetMapping(path="/{id}") // because of our @RequestMapping annotation at the top... this is equal to => @GetMapping("/cats/{id}")
	public ResponseEntity<Cat> getCatById(@PathVariable("id") int id) {
		Cat c = catServ.getCatById(id);
		return ResponseEntity.ok(c);
		
	}
	
	@PostMapping
	public ResponseEntity<Cat> addCat(@RequestBody Cat c) { // I want to acknowledge that a new Cat and endpoint have been created. 
		Cat cat = catServ.addCat(c);
		return ResponseEntity.created(URI.create("http://localhost:8080/CatAppSpringWeb/cats/" + cat.getId())).build();
		// TODO add comment re what we're doing here
	}
	

}