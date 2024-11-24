package by.tatevik.wee4.model;

import by.tatevik.wee4.service.Swimmable;

public class Ship implements Swimmable {
    @Override
    public void swim() {
        shipGetsTechService();
        System.out.println("Кораблик поплыл!");

    }
    private void shipGetsTechService(){
        System.out.println("Кораблик прошёл техническую проверку и готов к отплытию!");
    }
}
