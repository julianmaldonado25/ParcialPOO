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
public class WebGallery {
    private ArrayList<Usuario> usuarios ;

    public WebGallery() {
        
        this.usuarios = new ArrayList<>();
        
    }
    
    public void agregarUsuario(Usuario u){
       this.usuarios.add(u);
       
    }
    
    public  double venta(){
        double precio=0;
        for(Usuario u: usuarios){
            precio += u.precioPorObra();
            
        }
        
        return precio;
        
    }
    
    
    public String informacionUsusarios(){
        String info="";
        for (Usuario u: usuarios) {
            info += " "+ u.toString();
            
            
        }
        
        return info;
    }
    
}
