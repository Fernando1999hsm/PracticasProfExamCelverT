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
public class SumaDigitos {
    
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int pregunta=1, numero=0,suma=0;
        do{pregunta=1;
            System.out.println("Ingrese un valor int:");
            try {
                numero = lector.nextInt();
            } catch (InputMismatchException e){
                System.out.println("¡Cuidado! Solo puedes insertar números, intenta de nuevo");
                lector.next();
                pregunta=0;
            }
            
        }while(pregunta==0);
        
        System.out.println("Valor ingresado:"+numero);
        
        while(numero>0){
            suma=suma+numero%10;
            numero=numero/10;
        }
        
        System.out.println("Suma de los digitos:"+suma);
    }
    
}
