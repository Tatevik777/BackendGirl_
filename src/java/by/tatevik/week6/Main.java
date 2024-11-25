package by.tatevik.week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calcFactorial();


    }
    public static void checkTemperature() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру ");
        int temperature = sc.nextInt();
        if (temperature <= 0) {
            System.out.println("Сейчас очень холодно");
        }
        if (temperature >= 1 && temperature <= 16) {
            System.out.println("Сейчас прохладно");
        } else {
            System.out.println("Отличный летний денёк!");
        }
    }

    public static void evenOddNumCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = sc.nextInt();
        String result = n % 2 == 0 ? "Число чётное" : "Число нечётное";
        System.out.println(result);
    }
    enum DaysOfWeek {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};

    public static void checkDayOfTheWeek() {
        DaysOfWeek i = DaysOfWeek.Friday;

        switch (i) {
            case Sunday:
                System.out.println("Выходной день!");
                break;
            case Monday:
                System.out.println("Будний день!");
                break;
            case Tuesday:
                System.out.println("Будний день!");
                break;
            case Wednesday:
                System.out.println("Будний день!");
                break;
            case Thursday:
                System.out.println("Будний день!");
                break;
            case Friday:
                System.out.println("Будний день!");
                break;
            case Saturday:
                System.out.println("Выходной день!");
                break;
        }
    }

    public static void printNumSequence() {
        int n = 1;
        while (n <= 512) {
            System.out.print(n + " ");
            n *= 2;
        }
    }

    public static void calcFactorial(){
        //Создадим переменную, в которую занесем значение числа, заданного пользователем
        int a;
        //Переменная, которой будет присваиваться значение факториала заданного числа.
        // Тип переменной long также имеет свои ограничения на размер, что приводит к
        // ошибке если факториал заданного пользователем числа больше максимального размера
        // числа типа long
        long b=1;
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите целое число");
        //Проверка, является ли введенный знак целым числом
        if(scn.hasNextInt()){
            //Если проверка пройдена, переменной а присваивается значение введенного числа
            a=scn.nextInt();
            //Так как факториалом является произведение всех чисел до заданного числа с
            // помощью простого цикла получим это значение
            for(int i=a;i>0;i--){
                b*=i;
            }
            System.out.println("Факториал числа "+a+" равен "+b);
        }
        else System.out.println("Ошибка. Введено не число");
    }
}
