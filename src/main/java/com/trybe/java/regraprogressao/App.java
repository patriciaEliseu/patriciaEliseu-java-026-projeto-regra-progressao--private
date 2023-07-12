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
    for (int i = 1; i <= numeroAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      int peso = Integer.parseInt(scanner.nextLine());
      System.out.println("Digite a nota obtida para " + i + ":");
      int nota = Integer.parseInt(scanner.nextLine());
    }
  }
}
