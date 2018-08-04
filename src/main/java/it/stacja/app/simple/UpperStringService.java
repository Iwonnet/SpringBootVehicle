package it.stacja.app.simple;

public class UpperStringService implements StringService {


    @Override
    public String processString(String text) {
        return text.toLowerCase();
    }
}
