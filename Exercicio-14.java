package exercicio.pkg14;

import java.util.Scanner;

public class Exercicio14 {

  public static void main(String[] args) {
    System.out.println("EXERCÍCIO 14");
    System.out.println("Escreva um algoritmo que leia dois valores inteiro distintos\n"
            + "e informe qual é o maior;");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
        
    System.out.println("Digite o primeiro número: ");
    int numero1 = leitor.nextInt();
    System.out.println("Digite o segundo número: ");
    int numero2 = leitor.nextInt();
    String resultadoIguais = "Os dois números são iguais.";
    
    System.out.println("----------------------------------");
    if(numero1 == numero2){
      System.out.print(resultadoIguais);     
    } else {
      if(numero1 > numero2){
      System.out.print("Maior número digitado: " + numero1);  
    } else {
      System.out.print("Maior número digitado: " + numero2); 
    }
    }
    System.out.println();
    System.out.println("----------------------------------");
    
  }
  
}
