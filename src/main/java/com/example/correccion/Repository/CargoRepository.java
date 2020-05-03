/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.correccion.Repository;

import com.example.correccion.Model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author usuario
 */
public interface CargoRepository extends JpaRepository<Cargo,Long>{
  
}
