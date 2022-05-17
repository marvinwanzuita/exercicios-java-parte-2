package exercicio.pkg15;

import java.util.Scanner;

public class Exercicio15 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 15");
    System.out.println("Faça um algoritmo que receba um número e diga se este\n"
            + "número está no intervalo entre 100 e 200");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
        
    System.out.println("Digite um número: ");
    int numero = leitor.nextInt();
    
    System.out.println("----------------------------------");
    if (numero >= 100 && numero <= 200){
      System.out.println("O número digitado " + numero + " está no intervalo entre 100 e 200."); 
    } else {
      System.out.println("O número digitado " + numero + " NÃO está no intervalo entre 100 e 200."); 
    }
    System.out.println("----------------------------------");
    
  }
  
}
