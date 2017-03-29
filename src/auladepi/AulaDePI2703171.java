package auladepi;
  import java.util.Scanner;
    public class AulaDePI2703171 {
      public static void main (String [] args){
          Scanner leitor = new Scanner (System.in);
          System.out.print("Login: ");
          String Login = leitor.nextLine();
          System.out.print("Senha: ");
          String Senha = leitor.nextLine();
          //Tira espaços.
          Login = Login.trim();
          //boolean variável lógica, Login.equals iguala as variáveis.
        boolean autorizado = Login.equals("guilherme") && Senha.equals("0f5") ||
                  Login.equals("jair") && Senha.equals("0706");
        if (autorizado){
            System.out.println("Usuário autorizado");
        }else {
            System.out.println("Usuário não autorizado.");
        }
      }
}
