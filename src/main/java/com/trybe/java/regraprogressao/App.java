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
    int nAtividades = Integer.parseInt(input);
    for (int i = 1; i <= nAtividades; i++) {
      System.out.println("Digite o nome da atividade " + i + ":");
      String nome = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i + ":");
      String peso = scanner.nextLine();
      System.out.println("Digite a nota obtida para " + i + ":");
      String nota = scanner.nextLine();
    }
  }
}
