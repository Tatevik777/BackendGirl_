package by.tatevik.wee4.model;

import by.tatevik.wee4.service.Swimmable;

public class Fish implements Swimmable {
    @Override
    public void swim() {
        fishEatsWorm();
        System.out.println("Рыбка поплыла!");
    }
    private void fishEatsWorm(){
        System.out.println("Рыбка увидела червяка!");
    }
}
