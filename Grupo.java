
package com.mycompany.xd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Grupo {
        public ArrayList<Estudiante> estudiantes;
        public float promedioTotal;
        public Grupo (String csv){
            estudiantes = new ArrayList<Estudiante>();
            readcsv(csv);
            promedioTotal = 0;
            for (Estudiante estudiante: estudiantes){
                promedioTotal += estudiante.promedioT;
            }
            promedioTotal /= estudiantes.size();
        }
        public void readcsv(String csvFile) {
                
		try {
                    File file = new File (csvFile);
                    FileReader fr = new FileReader(file);
                    BufferedReader br = new BufferedReader(fr);
                    String line = "";											//Separa por espacios
                    String[] tempArr;
                    
                    while((line = br.readLine()) != null) {	
                        ArrayList<Float> notas = new ArrayList<Float>();
                        tempArr = line.split(",");
                        for(int i = 2 ; i<=5 ; i++) {	
                            float nota = Float.parseFloat(tempArr[i]);                                                           //A partir de la segunda columna va sumando el valor
                            notas.add(nota);
                        }
                        Estudiante estudiante = new Estudiante(tempArr[1],notas);
                        estudiantes.add(estudiante);								//Guarda PromEst en el Array PromTE
                     }

                     br.close();
                     
                     } catch(IOException ioe) {
                        ioe.printStackTrace();
                       
                     }
                
	   }
}
