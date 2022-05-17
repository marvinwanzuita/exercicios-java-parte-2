package exercicio.pkg16;

import java.util.Scanner;

public class Exercicio16 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 16");
    System.out.println("Escreva um algoritmo que leia o nome e as três notas\n"
            + "obtidas por um aluno durante o semestre. Calcular a sua média (aritmética),\n"
            + "informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5)\n"
            + "e Recuperação (media entre 5.1 a 6.9);");
    System.out.println("----------------------------------");
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite o nome do aluno: ");
    String nomeAluno = leitor.nextLine();
    System.out.println("Digite a primeira nota: ");
    float nota1 = leitor.nextFloat();
    System.out.println("Digite a segunda nota: ");
    float nota2 = leitor.nextFloat();
    System.out.println("Digite a terceira nota: ");
    float nota3 = leitor.nextFloat();
    
    float mediaNotas = (nota1 + nota2 + nota3) / 3;
    
    String aprovacao = "";
    
    if (mediaNotas >= 7) {
      aprovacao = "Aprovado";
    } else {
      if (mediaNotas < 7 && mediaNotas > 5){
        aprovacao = "em Recuperação";
      } else {
        aprovacao = "Reprovado";
      }
    }
    
    System.out.println("----------------------------------");
    System.out.println("Aluno " + nomeAluno + " está " + aprovacao);
    System.out.println("----------------------------------");
    
  }
  
}
