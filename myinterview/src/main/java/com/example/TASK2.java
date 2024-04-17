package com.example;

/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 */


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TASK2 {

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static Node removeMiddleNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node pointBaixo = head;
        Node pointCima = head;
        Node anterior = null;

        while (pointCima != null && pointCima.next != null) {
            pointCima = pointCima.next.next;
            anterior = pointBaixo;
            pointBaixo = pointBaixo.next;
        }

        anterior.next = pointBaixo.next;

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da lista (separados por espaços):");
        String[] elements = scanner.nextLine().split("\\s+");

        Node head = null;
        Node anterior = null;

        for (String element : elements) {
            int data = Integer.parseInt(element);
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                anterior.next = newNode;
            }
            anterior = newNode;
        }

        System.out.println("Lista original:");
        printList(head);

        head = removeMiddleNode(head);

        System.out.println("Lista após remover o nó do meio:");
        printList(head);

        scanner.close();
    }
}
