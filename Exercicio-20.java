package exercicio.pkg20;

import java.util.Scanner;

public class Exercicio20 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 20");
    System.out.println("A concessionária de veículos “CARANGO VELHO” está vendendo\n"
            + "os seus veículos com desconto. Faça um algoritmo que calcule e exiba o\n"
            + "valor do desconto e o valor a ser pago pelo cliente de vários carros.\n"
            + "O desconto deverá ser calculado de acordo com o ano do veículo.\n"
            + "Até 2000 - 12% e acima de 2000 - 7%. O sistema deverá perguntar se\n"
            + "deseja continuar calculando desconto até que a resposta seja: “(N) Não”.\n"
            + "Informar total de carros com ano até 2000 e total geral;");
    System.out.println("----------------------------------");
    
    Scanner leitor1 = new Scanner(System.in);
    Scanner leitor2 = new Scanner(System.in);
    Scanner leitor3 = new Scanner(System.in);
    
    float valorVeiculo;
    int anoVeiculo;
    char respostaPergunta;
    
    do{
      
      System.out.println("Digite o valor do veículo: ");
      System.out.print("R$ ");
      valorVeiculo = leitor1.nextInt();
      
      System.out.println("Digite o ano do veículo: ");
      anoVeiculo = leitor2.nextInt();
      
      if(anoVeiculo <= 2000){
        valorVeiculo = valorVeiculo - (valorVeiculo * 0.12f );
      } else {
        valorVeiculo = valorVeiculo - (valorVeiculo * 0.07f);
      }
      
      System.out.println("Valor do veículo com descondo do ano " + anoVeiculo + ": ");
      System.out.printf("R$ %.2f", valorVeiculo);
      System.out.println();
      System.out.println("----------------------------------");
      
      do {
        System.out.println("Deseja calcular outro veículo? S = Sim | N = Não ");
        respostaPergunta = leitor3.next().charAt(0);
        
        if(respostaPergunta != 'S' && respostaPergunta != 's' && respostaPergunta != 'N' && respostaPergunta != 'n'){
          System.out.println("Resposta inválida.");  
        }
      } while(respostaPergunta != 'S' && respostaPergunta != 's' && respostaPergunta != 'N' && respostaPergunta != 'n');
      System.out.println("----------------------------------");
    } while (respostaPergunta != 'N' && respostaPergunta != 'n');
   
  }
  
}
