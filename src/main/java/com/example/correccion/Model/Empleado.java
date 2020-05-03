package com.example.correccion.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author usuario
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long emp_id;
    @ApiModelProperty(hidden = false)
    private String emp_nombre;
    private String emp_apellido;
    private String emp_identificacion;
    private String emp_correo;

    @ManyToMany
    private List<Cargo> cargo;

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }
    public String getEmp_nombre() {
        return emp_nombre;
    }

    public void setEmp_nombre(String emp_nombre) {
        this.emp_nombre = emp_nombre;
    }
     public String getEmp_apellido() {
        return emp_apellido;
    }

    public void setEmp_apellido(String emp_apellido) {
        this.emp_apellido = emp_apellido;
    }
     public String getEmp_identificacion() {
        return emp_identificacion;
    }

    public void setEmp_identificacion(String emp_identificacion) {
        this.emp_identificacion = emp_identificacion;
    }
     public String getEmp_correo() {
        return emp_correo;
    }

    public void setEmp_correo(String emp_correo) {
        this.emp_correo = emp_correo;
    }
    

}
