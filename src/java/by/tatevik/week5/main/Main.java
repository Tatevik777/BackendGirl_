package by.tatevik.week5.main;

import by.tatevik.week5.model.Elephant;
import by.tatevik.week5.model.Giraffe;
import by.tatevik.week5.model.Tiger;

public class Main {
    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        tiger.eat();
        tiger.makeNoise();
        Giraffe giraffe=new Giraffe();
        giraffe.makeNoise();
        giraffe.fly();
        Elephant elephant=new Elephant();
        elephant.makeNoise();
        elephant.drink();
    }
}
