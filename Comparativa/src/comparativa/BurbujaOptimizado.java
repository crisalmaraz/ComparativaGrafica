/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamineto;

/**
 *
 * @author Tx
 */
public class BurbujaOptimizado {
    private double ti=0,tf=0,tiempo=0;
    
    public BurbujaOptimizado() {
    }
    
    public double ordenar(int n,double []a){
        double []arr=new double[n];
        double temp;
        
        ti=System.currentTimeMillis();
        //Algoritmo de la burbuja 
        for(int k=0;k<(n-1);k++){
            for(int x=0;x<(n-1-k);x++){
                if(a[x]>a[x+1]){
                    temp=a[x];
                    a[x]=a[x+1];
                    a[x+1]=a[x];
                }
            }
        }
        tf=System.currentTimeMillis();
        tiempo=tf-ti;
     return tiempo;
    }
}
