/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.correccion.Controller;

import com.example.correccion.Model.Empleado;
import com.example.correccion.Repository.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */

@RestController
@RequestMapping("empleado")

public class EmpleadoController {
    
    @Autowired
    EmpleadoRepository empleadorepository;
    @GetMapping("")
	@CrossOrigin
	public List<Empleado> listar() {
		return this.empleadorepository.findAll();	
	}	
	@PostMapping("")
	@CrossOrigin
	public Empleado guardar(@RequestBody Empleado e) {
		return this.empleadorepository.save(e);
	}
	@GetMapping("/{emp_id}")
	@CrossOrigin
	public Empleado recuperar(@PathVariable Long idEmpleado) {
		return this.empleadorepository.findById(idEmpleado).get();
	}
	@DeleteMapping("/{emp_id}")
	@CrossOrigin
	public void eliminar(@PathVariable  Long idEmpleado) {
		 this.empleadorepository.deleteById(idEmpleado);
	}
//    public Empleado BuscarporIdentificacion(Long identificacion){
//        return this.empleadorepository.findById(identificacion).get();
//    }
    
}
