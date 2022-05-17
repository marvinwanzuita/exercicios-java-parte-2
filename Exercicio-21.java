package exercicio.pkg21;

import java.util.Scanner;

public class Exercicio21 {

  public static void main(String[] args) {
    
    System.out.println("EXERCÍCIO 21");
    System.out.println("Escreva um algoritmo que leia os dados de “N” pessoas\n"
            + "(nome, sexo, idade e saúde) e informe se está apta ou não para cumprir\n"
            + "o serviço militar obrigatório. Informe os totais;");
    System.out.println("----------------------------------");
    
    Scanner leitorNome = new Scanner(System.in);
    Scanner leitorSexo = new Scanner(System.in);
    Scanner leitorIdade = new Scanner(System.in);
    Scanner leitorSaude = new Scanner(System.in);
    Scanner leitorResposta = new Scanner(System.in);
    
    char respostaPergunta;
    
    String nome;
    char sexo;
    int idade;
    char saude;
    
    int totalSexoMasculino = 0;
    int totalSexoFeminino = 0;
    int totalIdade = 0;
    int totalPessoasCadastradas = 0;
    float mediaTotalIdade;
    int totalSaudaveis = 0;
    int totalDoentes = 0;
    
    int totalAptosServicoMilitar = 0;
    int totalInaptosServicoMilitar  = 0;
    
    do {
      
      System.out.println("Digite o nome: ");
      nome = leitorNome.nextLine();
      
      System.out.println("Digite o sexo: (M = Masculino | F = Feminino");
      sexo = leitorSexo.next().charAt(0);
      
      System.out.println("Digite a idade: ");
      idade = leitorIdade.nextInt();
      
      System.out.println("Digite o estado de saúde: (S = Saudável | D = Doente");
      saude = leitorSaude.next().charAt(0);
      
      System.out.println("----------------------------------");
      
      System.out.println(" Nome: " + nome);
      
      if(sexo == 'M' || sexo == 'm'){
        System.out.println(" Sexo: Masculino");  
        totalSexoMasculino++;
      } else {
        if(sexo == 'F' || sexo == 'f'){
          System.out.println(" Sexo: Feminino");
          totalSexoFeminino++;
        } else {
          System.out.println(" Sexo: Indefinido");
        }
      }
      
      System.out.println("Idade: " + idade);
      totalIdade += idade;
      
      if(saude == 'S' || saude == 's'){
        System.out.println("Saúde: Saudável");
        totalSaudaveis++;
      } else {
        if(saude == 'D' || saude == 'd'){
          System.out.println("Saúde: Doente");
          totalDoentes++;
        } else {
          System.out.println("Saúde: Indefinido");
        }
      }
      
      if((idade < 18 && idade > 35) || (saude == 'D' || saude == 'd')){
        System.out.println("Estado para cumprir serviço militar: INAPTO"); 
        totalInaptosServicoMilitar++;
      } else {
        System.out.println("Estado para cumprir serviço militar: APTO");
        totalAptosServicoMilitar++;
      }
      
      System.out.println("----------------------------------");
      
      do {
        System.out.println("Deseja cadastrar outra pessoa? S = Sim | N = Não ");
        respostaPergunta = leitorResposta.next().charAt(0);
        
        if(respostaPergunta != 'S' && respostaPergunta != 's' && respostaPergunta != 'N' && respostaPergunta != 'n'){
          System.out.println("Resposta inválida.");  
        }
      } while(respostaPergunta != 'S' && respostaPergunta != 's' && respostaPergunta != 'N' && respostaPergunta != 'n');
      System.out.println("----------------------------------");
      
      totalPessoasCadastradas++;
      
    } while (respostaPergunta != 'N' && respostaPergunta != 'n');
    
    mediaTotalIdade = totalIdade / totalPessoasCadastradas;
    
    System.out.println("----------------------------------");
    System.out.printf("Média de idade das pessoas cadastradas: %.2f", mediaTotalIdade);
    System.out.println();
    System.out.println("Total de pessoas do sexo masculino: " + totalSexoMasculino); 
    System.out.println("Total de pessoas do sexo feminino: " + totalSexoFeminino); 
    System.out.println("Total de pessoas saudáveis: " + totalSaudaveis);
    System.out.println("Total de pessoas doentes: " + totalDoentes);
    System.out.println("Total de pessoas aptas para serviço militar: " + totalAptosServicoMilitar);
    System.out.println("Total de pessoas inaptas para serviço militar: " + totalInaptosServicoMilitar);
    
    
    
  }
  
}
