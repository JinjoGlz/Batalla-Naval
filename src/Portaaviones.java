/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumnos
 */
public class Portaaviones {
    private String [] coordenadas = new String[5];
    private int hits=0;
    
    public boolean verifDisparo(String a) {
        boolean hit = false;
        for (int i = 0; i < coordenadas.length; i++) {
            if(coordenadas[i].equals(a)){
                hit = true;
            }
        }
        if (hit= true){
            verifHundimiento();
        }
        return hit;
    }

    
    private void verifHundimiento() {
        
    }
    
}
