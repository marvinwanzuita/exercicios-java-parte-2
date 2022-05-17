package exercicio.pkg19;

import java.util.Scanner;

public class Exercicio19 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 19");
    System.out.println("Escreva um algoritmo que leia o nome e o sexo de 10 pessoas\n"
            + "e informe o nome e se ela é homem ou mulher. No final informe total\n"
            + "de homens e de mulheres;");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
    Scanner leitor2 = new Scanner(System.in);
    
    int masculino = 0;
    int feminino = 0;
    String nome;
    char sexo;
    
    for(int i = 0; i < 10; i++){
      
      System.out.println("Digite o nome da pessoa: ");
      nome = leitor.nextLine();
      
      System.out.println("Digite o sexo da pessoa: (M) Masculino | (F) Feminino ");
      sexo = leitor2.next().charAt(0);
      
      if ((sexo == 'M') || (sexo == 'm')){
        System.out.println("Nome: " + nome + ". Sexo: Masculino");
        System.out.println("----------------------------------");
        masculino++;
      } else {
        if ((sexo == 'F') || (sexo == 'f')){
          System.out.println("Nome: " + nome + ". Sexo: Feminino");
          System.out.println("----------------------------------");
          feminino++;
        } else {
          System.out.println("Opção inválida. ");
          System.out.println("----------------------------------");
        }
      }
    }
    
    System.out.println("----------------------------------");
    System.out.println("Total de pessoas do sexo masculino: " + masculino);
    System.out.println("Total de pessoas do sexo feminino: " + feminino);
    System.out.println("----------------------------------");
    
    
  }
  
}
