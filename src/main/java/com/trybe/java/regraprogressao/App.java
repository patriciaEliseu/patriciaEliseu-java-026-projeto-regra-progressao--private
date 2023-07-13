package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a quantidade de atividades para cadastrar: ");
    String input = scanner.nextLine();
    int numeroAtividades = Integer.parseInt(input);
    int pesoTotal = 0;
    int notaTotal = 0;
    int mediaTotal = 0;

    for (int i = 1; i <= numeroAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      int peso = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + (nome) + ":");
      int nota = Integer.parseInt(scanner.nextLine());

      pesoTotal += peso;
      notaTotal += (nota * peso);


    }

    if (pesoTotal == 100) {
      mediaTotal = notaTotal / pesoTotal;
    } else {
      System.out.println("Peso total diferente de 100.");
    }

    if (mediaTotal >= 85) {
      System.out.println("Parabéns! Você alcançou " + mediaTotal + ".0%! " + "E temos" +
          " o prazer de informar que você obteve aprovação!");
    } else if (mediaTotal < 85) {
      System.out.println("Lamentamos informar que, com base na sua pontuação " +
          "alcançada neste período, " + mediaTotal + ".0%, " +
          "você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
    scanner.close();
  }

}
