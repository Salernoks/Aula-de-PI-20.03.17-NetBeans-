package auladepi.pkg21.pkg03;

import java.util.Scanner;

public class ExercícioBhaskara {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
      //ENTRADAS
        System.out.print("x1: ");
        double x1 = leitor.nextDouble();
        System.out.print("x2: ");
        double x2 = leitor.nextDouble();
        System.out.print("c: ");
        double c = leitor.nextDouble();
        
        //PROCESSAMENTO
        double s = x1 + x2;
        double p = x1 * x2;
        double a = c / p;
        double b = -(a * s);
        
        //SAÍDA
        System.out.println(a + " x² + " + b + " x +" + c + " = 0");
        
        
        
        
        
         
        
        
        
        
      
      
      
    }
    
}
