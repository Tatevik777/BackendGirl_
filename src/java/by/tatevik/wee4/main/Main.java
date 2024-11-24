package by.tatevik.wee4.main;

import by.tatevik.wee4.model.Fish;
import by.tatevik.wee4.model.Ship;
import by.tatevik.wee4.service.SwimExecutor;

public class Main {
    public static void main(String[] args) {
        Fish fish=new Fish();
        Ship ship=new Ship();
        SwimExecutor swimExecutor=new SwimExecutor();
       swimExecutor.goSwim(ship);
       swimExecutor.goSwim(fish);
    }
}
