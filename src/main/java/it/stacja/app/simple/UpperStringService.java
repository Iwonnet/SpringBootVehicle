package it.stacja.app.simple;


import org.springframework.stereotype.Component;

@Component
public class UpperStringService implements StringService {


    @Override
    public String processString(String text) {
        return text.toLowerCase();
    }
}
