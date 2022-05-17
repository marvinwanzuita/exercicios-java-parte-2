package exercicio.pkg24;

import java.util.Scanner;

public class Exercicio24 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 24");
    System.out.println("Faça um algoritmo que receba 10 números e mostre positivo,\n"
            + "negativo ou zero para cada número;;");
    System.out.println("----------------------------------");
    
    Scanner leitorNumero = new Scanner(System.in);
    
    int numero;
    
    for(int i = 1; i <= 10; i++){
      System.out.println("Digite um número: ");
      numero = leitorNumero.nextInt();
      if(numero < 0){
        System.out.println("Número digitado é NEGATIVO.");
      } else {
        if(numero > 0){
          System.out.println("Número digitado é POSITIVO.");
        } else {
          System.out.println("Número digitado é ZERO");
        }
      }
      System.out.println("----------------------------------");
    }
    
  }
  
}
