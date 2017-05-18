/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Estudiante
 */
public class Artista extends Usuario {
       Obra obra;
       private String distinciones;
       private String curriculum;

    public Artista(Obra obra, String distinciones, String curriculum, String nombre, String apellido) {
        super(nombre, apellido);
        this.obra = obra;
        this.distinciones = distinciones;
        this.curriculum = curriculum;
    }
    

   

    @Override
    public double precioPorObra() {
       return this.obra.getPrecio();
       
    }

    @Override
    public String informacion() {
        return "Artista: "+"Nombre: "+ this.nombre+", Apellido "+this.apellido+", Curriculum: "+this.curriculum+", Distinciones: "+this.distinciones+", vende "+this.obra+"." ;   
        
        
        
       
    }
    
    
}
