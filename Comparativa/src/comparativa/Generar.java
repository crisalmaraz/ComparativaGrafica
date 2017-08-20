/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamineto;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author Tx
 */
public class Generar {

    public Generar() {
    }
  
    public static double[] genera(int n,int max){
        double[] datos = new double[n];
        Random c = new Random();
        
        for (int x=0; x < n ; x++){
           datos[x] = c.nextInt(max);
        }
        return datos;
    }    
}
