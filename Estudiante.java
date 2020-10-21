
package com.mycompany.xd;

import java.util.ArrayList;


public class Estudiante {
    public String nombre;
    public float promedioT;
    public ArrayList<Float> notas;

    public Estudiante(String nombre, ArrayList<Float> notas) {
        this.nombre = nombre;
        this.promedioT = 0;
        for (float nota: notas ){
            promedioT += nota;
            
        }
        promedioT /= notas.size();											
        
    }
    
}