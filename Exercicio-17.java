

package exercicio.pkg17;

import java.util.Scanner;

public class Exercicio17 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 17");
    System.out.println("Leia 10 números e ao final informar quantos número(s)\n"
            + "estão no intervalo entre 10 (inclusive) e 150 (inclusive);");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
        
    int totalNumerosIntervalo = 0;
    
    for(int i = 0; i < 10; i++){
      System.out.println("Digite um número: ");
      int numero = leitor.nextInt();
      
      if(numero >= 10 && numero <= 150){
        totalNumerosIntervalo++;
      }
    }
    
    System.out.println("----------------------------------");
    System.out.println("Total de números entre 10 e 150: " + totalNumerosIntervalo);
    System.out.println("----------------------------------");
    
  }
  
}
