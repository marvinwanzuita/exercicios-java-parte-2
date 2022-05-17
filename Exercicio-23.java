package exercicio.pkg23;

import java.util.Scanner;

public class Exercicio23 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 23");
    System.out.println("Faça um algoritmo que receba um número e mostre uma mensagem\n"
            + "caso este número seja maior que 80, menor que 25 ou igual a 40;");
    System.out.println("----------------------------------");
    
    Scanner leitorNumero = new Scanner(System.in);
    
    System.out.println("Digite um número: ");
    int numero = leitorNumero.nextInt();
    
    System.out.println("----------------------------------");
    if((numero > 80) || (numero < 25) || (numero == 40)){
      System.out.println("Mensagem afirmando que a condição sugerida foi atendida.");
    }
    System.out.println("----------------------------------");
    
  }
  
}
