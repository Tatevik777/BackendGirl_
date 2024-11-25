package by.tatevik.week5.model;

import by.tatevik.week5.util.AbstractAnimal;
import by.tatevik.week5.util.Voice;

public class Tiger extends AbstractAnimal implements Voice {


    @Override
    public void walk() {
        System.out.println("Я тигр и я хожу");
    }

    @Override
    public void drink() {
        System.out.println("Я тигр и я пью воду");
    }

    @Override
    public void fly() {
        System.out.println("Я тигр и я не умею летать");
    }

    @Override
    public void eat() {
        System.out.println("Я тигр и я ем мясо");
    }

    @Override
    public void makeNoise() {
        System.out.println("Я тигр и я говорю РРРРРР");
    }
}