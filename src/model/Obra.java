/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Obra {
   protected String nombre;
   protected double precio;
   protected String descripcion;

    public Obra(String nombre, double precio, String descripcion) {
        Scanner sc = new Scanner(System.in);
        nombre = sc.next();
        precio = sc.nextDouble();
        descripcion = sc.next();
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
   
   
}
