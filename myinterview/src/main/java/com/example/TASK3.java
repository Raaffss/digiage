package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */

public class TASK3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listaItens = new ArrayList<>();

        System.out.println("Digite os itens da lista (digite 'fim' para terminar):");
        String item = scanner.nextLine();
        while (!item.equalsIgnoreCase("fim")) {
            listaItens.add(item);
            item = scanner.nextLine();
        }

        scanner.close();

        Set<String> itensDistintos = new HashSet<>(listaItens);

        System.out.println("Número total de itens na lista: " + listaItens.size());

        System.out.println("Número de itens distintos: " + itensDistintos.size());
    }
}
