package com.devnet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devnet.entities.Produit;
@Service
public class ProduitMockServiceImpl implements IProduitService {
	private List<Produit> produits;
	
    
    
	public ProduitMockServiceImpl() {
		produits=new ArrayList<Produit>();
	    

	    produits.add(new Produit("Livre",50,25.5f));
	    produits.add(new Produit("Cahier",150,15.5f));
	    produits.add(new Produit("Stylo",500,5.5f));
	}

	@Override
	public List<Produit> getProduits() {
		// TODO Auto-generated method stub
		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);

	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);

	}

	@Override
	public void deletProduit(String ref) {
		Produit produit=new Produit();
		produit.setRef(ref);
		produits.remove(produit);

	}

}
