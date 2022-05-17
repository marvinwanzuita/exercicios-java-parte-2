package exercicio.pkg22;

import java.util.Scanner;

public class Exercicio22 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 22");
    System.out.println("Faça um algoritmo que receba o preço de custo e o preço de\n"
            + "venda de 10 produtos. Mostre como resultado se houve lucro, prejuízo\n"
            + "ou empate para cada produto. Informe o valor de custo de cada produto, o valor\n"
            + "de venda de cada produto, a média de preço de custo e do preço de venda;");
    System.out.println("----------------------------------");
    
    float precoCusto[] = new float[10];
    float precoVenda[] = new float[10];
    
    float totalPrecoCusto = 0;
    float totalPrecoVenda = 0;
    float mediaPrecoCusto = 0;
    float mediaPrecoVenda = 0;
    
    
    
    float precoFinal = 0;
    
    Scanner leitorPrecoCusto = new Scanner(System.in);
    Scanner leitorPrecoVenda = new Scanner(System.in);
    
    for(int i = 1; i <= 10; i++){
      
      System.out.println("Digite o preço de custo: ");
      System.out.print("R$ ");
      precoCusto[i] = leitorPrecoCusto.nextFloat();
      totalPrecoCusto += precoCusto[i];
      
      System.out.println("Digite o preço de venda: ");
      System.out.print("R$ ");
      precoVenda[i] = leitorPrecoVenda.nextFloat();
      totalPrecoVenda += precoVenda[i];
      
      if(precoCusto[i] < precoVenda[i]){
        precoFinal = precoVenda[i] - precoCusto[i];
        System.out.printf("Venda com lucro de R$ %.2f", precoFinal);
        System.out.println();
      } else {
        if(precoCusto[i] > precoVenda[i]){
          precoFinal = precoCusto[i] - precoVenda[i];
          System.out.printf("Venda com prejuízo de R$ %.2f", precoFinal);
          System.out.println();
        } else {
          System.out.println("Preços iguais.");
        }
      }
      System.out.println("----------------------------------");
    }
    
    for(int i = 1; i <= 10; i++){
      System.out.printf("Valor de custo do " + i + "º produto: R$ %.2f", precoCusto[i]);
      System.out.println();  
    }
    
    System.out.println("----------------------------------");
    
    for(int i = 1; i <= 10; i++){
      System.out.printf("Valor de venda do " + i + "º produto: R$ %.2f", precoVenda[i]);
      System.out.println();  
    }
    
    System.out.println("----------------------------------");
    
    mediaPrecoCusto = totalPrecoCusto / 10;
    mediaPrecoVenda = totalPrecoVenda / 10;
    
    System.out.printf("Valor médio de custo de todos os produtos: R$ %.2f", mediaPrecoCusto);
    System.out.println(); 
    
    System.out.printf("Valor médio de venda de todos os produtos: R$ %.2f", mediaPrecoVenda);
    System.out.println(); 
    
  }
  
}
