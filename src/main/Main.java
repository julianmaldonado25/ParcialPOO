/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;
import model.*;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        WebGallery wg = new WebGallery();
        Scanner sc = new Scanner(System.in);
        int numob = sc.nextInt();
        ArrayList<Obra> ar = new ArrayList();
        
        
        Comprador cp = new Comprador(ar,"Luis","Rodriguez");
       
        
        System.out.println(wg.informacionUsusarios());
        /*for (int i = 0; i < numob; i++) {
            
            String n = sc.next();
            double p= sc.nextDouble();
            String d = sc.next();
            
            Obra[] o = new Obra[i];
            
            
            
            //Obra o = new Obra(n,p,d);
            o[i]= new Obra(n,p,d);
            System.out.println(o[i].getNombre()+""+o[i].getPrecio()+o[i].getDescripcion());
        }
        */
        
        
    }
    
}
