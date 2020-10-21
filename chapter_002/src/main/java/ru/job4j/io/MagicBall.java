package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static String generateAnswer() {
        String answer;
        int number = new Random().nextInt(3);
        if (number == 0) {
            answer = "Да";
        } else if (number == 1) {
            answer = "Нет";
        } else {
            answer = "Может быть";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        input.nextLine();
        String answer = generateAnswer();
        System.out.println(answer);
    }
}