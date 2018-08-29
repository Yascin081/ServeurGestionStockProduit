package com.devnet;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.devnet.entities.Produit;
import com.devnet.entities.Role;
import com.devnet.entities.User;
import com.devnet.repository.ProduitRepository;
import com.devnet.repository.RoleRepository;
import com.devnet.repository.UserRepository;
import com.devnet.util.RoleEnum;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
		
		ProduitRepository produitRepository = ctx.getBean(ProduitRepository.class);
		
		produitRepository.save(new Produit("Livre", 50, 20));
		produitRepository.save(new Produit("Cahier", 200, 5.25f));
		produitRepository.save(new Produit("Stylo", 500, 2.10f));
		
		RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
		
		Role roleUser = new Role(RoleEnum.ROLE_USER);
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
		
		roleRepository.save(roleUser);
		roleRepository.save(roleAdmin);
		
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		
		User user = new User("user", "password1", true);
		user.setRoles(Arrays.asList(roleUser));
		
		userRepository.save(user);
		
		User admin = new User("admin", "password2", true);
		admin.setRoles(Arrays.asList(roleUser, roleAdmin));
		
		userRepository.save(admin);
		
	}
}
