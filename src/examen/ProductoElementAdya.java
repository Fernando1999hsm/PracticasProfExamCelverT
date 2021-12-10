/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class ProductoElementAdya {
    
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        int pregunta=1, numero=0;
        do{pregunta=1;
            System.out.println("Ingrese la cantidad de numeros del areglo:");
            try {
                numero = lector.nextInt();
            } catch (InputMismatchException e){
                System.out.println("¡Cuidado! Solo puedes insertar números, intenta de nuevo");
                lector.next();
                pregunta=0;
            }
        }while(pregunta==0);
        double [] arreglo=new double [numero];
        double numarray;
        for(int i=0;i<numero;i++){
            do{pregunta=1;
                System.out.println("Ingrese el numero del arreglo"+i);
                try {
                    numarray = lector.nextInt();
                    arreglo[i]=numarray;
                } catch (InputMismatchException e){
                    System.out.println("¡Cuidado! Solo puedes insertar números, intenta de nuevo");
                    lector.next();
                    pregunta=0;
                }
            }while(pregunta==0);
        }
        double suma,sumaG=0;
        String mensaje="";
        for(int j=0;j<numero-1;j++){
            suma=arreglo[j]*arreglo[j+1];
            if(suma>sumaG || sumaG==0){
                mensaje="Los elementos adyacentes cuyo producto sea el mas grande, son "+arreglo[j]+" * "+arreglo[j+1]+" = "+suma;
                sumaG=suma;
                suma=0;
            }
        }
        System.out.println(mensaje);
    }
}
