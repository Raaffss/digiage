package com.example;
import java.util.Scanner;
/**
 * 
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 * 
 * 
 * 
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
public class TASK1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite uma palavra ou frase para verificar se é um palíndromo:");
            String entrada = scanner.nextLine();
            if (isPalindromo(entrada)) {
                System.out.println("A entrada é um palíndromo.");
            } else {
                System.out.println("A entrada não é um palíndromo.");
            }
            System.out.println("Deseja verificar outro palíndromo? (S/N)");
            String opcao = scanner.nextLine();
            if (!opcao.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }
        scanner.close();
    }

    public static boolean isPalindromo(String str) {
        String strLimpa = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int esquerda = 0;
        int direita = strLimpa.length() - 1;
        while (esquerda < direita) {
            if (strLimpa.charAt(esquerda) != strLimpa.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}
