/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Comprador extends Usuario{
    private  ArrayList<Obra> numObras = new ArrayList<>();

    public Comprador(ArrayList numObras, String nombre, String apellido) {
        super(nombre, apellido);
        this.numObras = numObras;
    }

   
   

  

    

    @Override
    public double precioPorObra() {
       double precio = 0;
        for(Obra o: numObras){ 
        
            precio = o.getPrecio()*0.2;
        
        }
       return precio;
    }

    @Override
    public String informacion() {
        return "Comprador: "+"Nombre: "+ this.nombre+", Apellido "+this.apellido+", se lleva "+ this.numObras.size()+" obras." ;
    }
    
    
    
    
}
