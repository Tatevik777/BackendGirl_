package by.tatevik.week10;

import java.util.HashMap;

public class Account {
    private String login;
    private String password;
    private HashMap<String,String> users = new HashMap<>();

    public void checkLogin(String login) throws WrongLoginException {
        if(login==null|| login.length()<=5|| login.length()>=20){
            throw new WrongLoginException("Логин должен быть не пустым и иметь длину от 6 до 19 символов.");
        }
        this.login=login;
    }

    public void checkPassword(String password, String confirmPassword) throws Exception {
        if (password == null || password.length() <= 8 || password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль должен быть не пустым, длиной от 9 до 19 символов и совпадать с подтверждением.");
        }
        this.password = password;
    }

    public String checkLoginAndPassword(String login, String password)
            throws WrongLoginOrPasswordException {
        if (users.containsKey(login) && users.get(login).equals(password)) {
            return "Вы успешно вошли в аккаунт!";
        } else {
            throw new WrongLoginOrPasswordException("Неверный логин или пароль.");
        }
    }

    public void addUser(String login, String password) {
        users.put(login, password);
    }
}
