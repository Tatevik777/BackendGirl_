package by.tatevik.week10;

public class WrongLoginOrPasswordException extends  Exception{
    public WrongLoginOrPasswordException(String message) {
        super(message);
    }
}
