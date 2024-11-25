package by.tatevik.week5.model;

import by.tatevik.week5.util.AbstractAnimal;
import by.tatevik.week5.util.Voice;

public class Elephant extends AbstractAnimal implements Voice {
    @Override
    public void walk() {
        System.out.println("Я слон и я хожу");
    }

    @Override
    public void drink() {
        System.out.println("Я слон и я пью много воды");
    }

    @Override
    public void fly() {
        System.out.println("Я слон и я не умею летать");
    }

    @Override
    public void eat() {
        System.out.println("Я слон и я не ем мясо");
    }

    @Override
    public void makeNoise() {
        System.out.println("Я слон и я  говорю Трууууу Тууу Тууу");
    }
}
