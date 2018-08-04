package it.stacja.app.simple;

import org.springframework.stereotype.Component;

@Component
public interface StringService {

    String processString(String text);
}
