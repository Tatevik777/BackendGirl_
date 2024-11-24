package by.tatevik.week3;

public class Main {
    public static void main(String[] args) {
        Car ferrari=new Car("red","Ferrari");
        Car lexus=new Car("blue","Lexus");
        Car suzuki=new Car("green","suzuki");

        Car porche= new Car();
        porche.colour="white";
        porche.brand="Порше";

        System.out.println(" Машина с дефолтным конструктором  "+porche.brand + " цвет "+porche.colour);
        System.out.println(" Машина  "+ferrari.brand + " цвет "+ferrari.colour);
        System.out.println(" Машина  "+lexus.brand + " цвет "+lexus.colour);
        System.out.println(" Машина  "+suzuki.brand + " цвет "+suzuki.colour);

        System.out.println(" Судзуки поехала   "+suzuki.goCar());
        System.out.println(" Судзуки! Стоп!   "+suzuki.stopCar());
        System.out.println(" Дальше едет Феррари  "+ferrari.goCar());
        System.out.println(" Феррари! Стоп!   "+ferrari.stopCar());
        System.out.println(" Лексус, вперёд!   "+lexus.goCar());
        System.out.println(" Дорогу заканчивает Лексус   "+lexus.stopCar());

    }
}
