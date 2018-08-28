package com.devnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.devnet.entities.Produit;
import com.devnet.repository.ProduitRepository;
@Service
@Primary
public class ProduitService implements IProduitService {
	@Autowired
   private ProduitRepository produitRepository;
	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public void addProduit(Produit produit) {
		// TODO Auto-generated method stub
        produitRepository.save(produit);
	}

	@Override
	public void updateProduit(Produit produit) {
		// TODO Auto-generated method stub
         produitRepository.save(produit);
	}

	@Override
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		Produit produit=new Produit();
		produit.setId(id);
        produitRepository.delete(produit);
	}

}
