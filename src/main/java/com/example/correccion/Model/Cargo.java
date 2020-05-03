/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.correccion.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author usuario
 */
@Entity
public class Cargo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long car_id;
    private String car_nombre;
    private double car_salario;
    private boolean car_estado;

    public long getCar_id() {
        return car_id;
    }

    public void setCar_id(long car_id) {
        this.car_id = car_id;
    }

    public String getCar_nombre() {
        return car_nombre;
    }

    public void setCar_nombre(String car_nombre) {
        this.car_nombre = car_nombre;
    }

    public double getCar_salario() {
        return car_salario;
    }

    public void setCar_salario(double car_salario) {
        this.car_salario = car_salario;
    }

    public boolean isCar_estado() {
        return car_estado;
    }

    public void setCar_estado(boolean car_estado) {
        this.car_estado = car_estado;
    }

   
    
    
    
    
}
