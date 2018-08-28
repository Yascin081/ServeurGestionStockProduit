package com.devnet.service;
import java.util.List;

import com.devnet.entities.*;
public interface IProduitService {
 List<Produit> getProduits();
 void addProduit(Produit produit);
 void updateProduit(Produit produit);
 void deleteProduit(Long id);
}
