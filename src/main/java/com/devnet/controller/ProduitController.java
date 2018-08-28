package com.devnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devnet.entities.Produit;
import com.devnet.service.IProduitService;

@RestController
@RequestMapping("/api/produits")
@CrossOrigin
public class ProduitController {
	@Autowired
	private IProduitService produitService;
	
	@GetMapping
	public List<Produit> getAll(){
		return produitService.getProduits();
	}
	
	@PostMapping
	public void add(@RequestBody Produit produit) {
		produitService.addProduit(produit);
	}
	
	@PutMapping
	public void update(@RequestBody Produit produit) {
		produitService.updateProduit(produit);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		produitService.deleteProduit(id);
	}
	

}
