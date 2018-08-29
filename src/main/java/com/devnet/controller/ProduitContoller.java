package com.devnet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devnet.entities.Produit;

@RestController
@RequestMapping("/api/produit")
public class ProduitContoller extends CrudController<Produit, Long>{

}
