package com.devnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devnet.entities.Produit;



@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
