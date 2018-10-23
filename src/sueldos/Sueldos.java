/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import utilidades.Entrada;

/**
 *
 * @author arubio
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     * Pedir 10 sueldos. Mostrar el mayor, el menor, la suma y cuantos
     * hay mayores de 1000€
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración e inicialización
        double sueldo;
        double menorSueldo=0, mayorSueldo=0, sumaSueldo=0;
        int mayoresMil=0; //para almacenar los cuantos sueldos mayores que 1000
        
        //Bucle para pedir los 10 sueldos
        for(int i=0;i<10;i++)
        {
            //Pedimos un sueldo válido
            do 
            {
                System.out.println("Introduce un sueldo válido");
                sueldo=Entrada.realDoble();
            }while (sueldo<=0);
            
            //Procesamos los sueldos
            //El primer sueldo introducido empezará siendo el menor y el mayor            
            if (i==1)
            {
                menorSueldo=sueldo;
                mayorSueldo=sueldo;
            }
            //En cualquier otro caso actualizamos el mínimo y el máximo sueldo
            else
            {
                menorSueldo=Math.min(menorSueldo, sueldo);
                mayorSueldo=Math.max(mayorSueldo, sueldo);
                
                
                
            }
            
            //Acumulamos la suma de los sueldos
            sumaSueldo+=sueldo;
            
            //Acumulamos la cantidad de sueldos mayores a 1000
            if (sueldo>1000)
                mayoresMil++;
            
        }
        
        //Salida de datos
        System.out.println("El sueldo mayor es: "+mayorSueldo);
        System.out.println("El sueldo menor es: "+menorSueldo);
        System.out.println("La acumulación de los sueldos es: "+sumaSueldo);
        System.out.println("La cantidad de sueldos mayores a 1000 es: "+mayoresMil);
    }
    
}
