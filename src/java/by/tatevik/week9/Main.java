package by.tatevik.week9;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Panda", 10));
        animals.add(new Animal("Lion", 2));
        animals.add(new Animal("Tiger", 3));
        animals.add(new Animal("Puma", 4));
        animals.add(new Animal("Lama", 5));
        animals.add(new Animal("Capybara", 15));
        animals.add(new Animal("Wolf", 7));
        animals.add(new Animal("Elephant", 6));
        animals.add(new Animal("Hippo", 9));
        animals.add(new Animal("Horse", 1));
        // Проверяем наличие льва и выводим его возраст или выбрасываем исключение
        int ageOfLion = animals.stream()
                .filter(animal -> animal.getName().equals("Lion"))
                .map(animal -> animal.getAge())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Lion is not found"));
        System.out.println("Lion age: " + ageOfLion);
        //Выведите на экран всех животных из коллекции в порядке возрастания их возраста
        animals.stream().sorted(Comparator.comparingInt(Animal::getAge))
                .forEach(System.out::println);
        //Посчитайте сколько животных в коллекции, у которых возраст больше 4
        long count = animals.stream()
                .filter(animal -> animal.getAge() > 4)
                .count();
        System.out.println("Amount of animals older than 4 years old: " + count);
        //Создайте Map из коллекции животных.
        // Ключ - название животного, значение - экземпляр животного.
        // Выведите все пары ключ-значение в консоль
        Map<String, Animal> animalMap = new HashMap<>();
        animalMap.put("Panda", new Animal("Panda"));
        animalMap.put("Lion", new Animal("Lion"));
        animalMap.put("Tiger", new Animal("Tiger"));
        animalMap.put("Puma", new Animal("Puma"));
        // Выводим все пары ключ-значение в консоль
        for (Map.Entry<String, Animal> entry : animalMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        //Выведите названия всех животных одной строкой (используйте reduce())
        String animalNames = animalMap.values().stream()
                .map(Animal::getName)
                .reduce("", (name1, name2) -> name1.isEmpty() ? name2 : name1 + ", " + name2);

        // Выводим названия животных одной строкой
        System.out.println("Animal names : " + animalNames);
    }
}


