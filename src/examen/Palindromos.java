/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Palindromos {
    
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String palabra;
        String arbalap="";
        System.out.println("Ingrese una palabra/cadena:");
        palabra = lector.nextLine();
        
        int tamaño=palabra.length();
        for(int i=tamaño;i>=1;i--){
            arbalap=arbalap+palabra.charAt(i-1);
        }
        
        if(arbalap.equals(palabra)){
            System.out.println(palabra + " es un palindromo");
        }else{
            System.out.println(palabra + " no es un palindromo");
        }
    }
}
