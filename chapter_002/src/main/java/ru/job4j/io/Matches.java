package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int player = 2;
        int number = 11;
        int move;
        while (number > 0) {
            player = (player == 1) ? 2 : 1;
            while (true) {
                if (number >= 3) {
                    System.out.println("Игрок " + player + ", введите число от 1 до 3: ");
                } else if (number == 2) {
                    System.out.println("Игрок " + player + ", введите число от 1 или 2: ");
                } else {
                    System.out.println("Игрок " + player + ", введите число 1: ");
                }

                move = Integer.valueOf(input.nextLine());
                if ((move >= 1) && (move <= 3) && (number - move >= 0)) {
                    break;
                }
                System.out.println("Введите допустимое количество спичек.");
            }
            number -= move;
            System.out.println("Осталось " + number + " спичек.");
        }
        System.out.println("Игрок " + player + " вы победили!");
    }
}
