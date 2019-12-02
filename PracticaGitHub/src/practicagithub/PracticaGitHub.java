/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class PracticaGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int any;
        System.out.print("Introdueix l'any: ");
        any = sc.nextInt();
        if(anyBisiesto(any))  
           System.out.println("L'any es bisiesto");
        else
           System.out.println("L'any no es bisiesto");
        
        sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer número: ");
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        numero2 = sc.nextInt();
        resultado = restar(numero1, numero2);
        System.out.println("Resta: " + resultado);
    } 
    
    

    public static boolean anyBisiesto(int a){       
        
        if(a%4==0 && a%100!=0 || a%400==0)
           return true;
        else
           return false;
    }
    
    //2a funció
    public static int restar(int a, int b){
           int c;
           c = a - b;
           return c;
   
    
    }
}

