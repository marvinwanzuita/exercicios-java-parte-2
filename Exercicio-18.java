package exercicio.pkg18;

import java.util.Scanner;

public class Exercicio18 {
  
  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 18");
    System.out.println("Faça um algoritmo que receba a idade de 10 pessoas\n"
            + "e mostre mensagem informando “maior de idade” e “menor de idade”\n"
            + "para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
    
    for(int i = 0; i < 10; i++){
       
      System.out.println("Digite a idade: ");
      int idade = leitor.nextInt();
      
      if (idade >= 18){
        System.out.println("Maior de idade.");
      } else {
        System.out.println("Menor de idade.");
      }
      
      System.out.println("----------------------------------");
    }
  }
}
