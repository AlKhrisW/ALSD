package Tugas;

import java.util.Scanner;

public class LinkedList {
    NodeScavangerHunt head = null;
    public void addQuestion(String soal, String jawaban) {
        NodeScavangerHunt newNode = new NodeScavangerHunt(soal, jawaban);
        if (head == null) {
            head = newNode;
        } else {
            NodeScavangerHunt current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void check(String jawaban, NodeScavangerHunt current) {
        if (current != null && current.jawaban.equalsIgnoreCase(jawaban)) {
            System.out.println("Jawaban Benar");
        } else {
            System.out.println("Jawaban salah, coba lagi");
        }
    }
    public void play() {
        Scanner sc = new Scanner(System.in);
        NodeScavangerHunt current = head;
        while(current != null) {
            System.out.println(current.pertanyaan);
            System.out.print("Jawab: ");
            String jawaban = sc.nextLine();
            check(jawaban, current);
            current = current.next;
        }
        System.out.println("Harta Karun Ditemukan");
    }
}
