package by.tatevik.week10;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        try {
            account.checkLogin("User123"); // Пример логина
            account.checkPassword("password123", "password123"); // Пример пароля
            account.addUser("User123", "password123"); // Добавление пользователя

            // Проверка логина и пароля
            String result = account.checkLoginAndPassword("User123", "password123");
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
