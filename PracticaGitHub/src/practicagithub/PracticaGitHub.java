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
        int año;
        System.out.print("Introdueix l'any: ");
        año = sc.nextInt();
        if(anyBisiesto(año))  
           System.out.println("L'any es Bisiesto");
        else
           System.out.println("L'any no es bisiesto");
    }
    
    public static boolean anyBisiesto(int a){   
        if(a%4==0 && a%100!=0 || a%400==0)
           return true;
        else
           return false;
    }
    
    //2a funció
    
    
    
    
}

