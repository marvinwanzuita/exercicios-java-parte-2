package exercicio.pkg13;

import java.util.Scanner;

public class Exercicio13 {

  public static void main(String[] args) {
    System.out.println("EXERCÍCIO 13");
    System.out.println("Faça um algoritmo que receba um número e mostre uma mensagem\n"
            + "caso este número seja maior que 10;");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
        
    System.out.println("Digite um número ");
    int numero = leitor.nextInt();
    String maiorQue10 = "";
    
    if (numero > 10){
      maiorQue10 = "O número digitado é maior que 10.";
    }
    
    System.out.println("----------------------------------");
    System.out.print(maiorQue10);
    System.out.println();
    System.out.println("----------------------------------");
    
  }
  
}
