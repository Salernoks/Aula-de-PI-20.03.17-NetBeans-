package auladepi;
  import java.util.Scanner;
    public class AulaDePI270317 {
      public static void main (String [] agrs){
         Scanner leitor = new Scanner(System.in);
         double n, r;
          System.out.println("Validação.");
          System.out.print("Digite um número: ");
          n = leitor.nextDouble();
          r = 2 * n;
          if (n >=1 && n <=12){
              System.out.println("O dobro do número é "+r);
          }else{System.out.println("número inválido");
          }
     }
}

