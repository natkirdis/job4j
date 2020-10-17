package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();

        kolobok.roll();
        hare.tryEat(kolobok);
        kolobok.escape(hare);
        kolobok.roll();
        wolf.tryEat(kolobok);
        kolobok.escape(wolf);
        kolobok.roll();
        fox.tryEat(kolobok);
        fox.eat(kolobok);
    }

}
