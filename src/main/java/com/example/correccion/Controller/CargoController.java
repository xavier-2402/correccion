/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.correccion.Controller;

import com.example.correccion.Model.Cargo;
import com.example.correccion.Repository.CargoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("cargo")
public class CargoController {
    
        @Autowired
	CargoRepository cargorepository;
        
	
	@GetMapping("")
	@CrossOrigin
	public List<Cargo> listar() {
		return this.cargorepository.findAll();
		
	}
	@PostMapping("")
	@CrossOrigin
	public Cargo listar( @RequestBody Cargo e) {
		return this.cargorepository.save(e);
	}
        
        
        
        
}
