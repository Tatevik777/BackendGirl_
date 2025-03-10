package by.tatevik.week9;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder=new StringBuilder();
       stringBuilder.append("Animal name ").append(name).append(" Animal age ").append(age);

        return stringBuilder.toString();
    }
}
