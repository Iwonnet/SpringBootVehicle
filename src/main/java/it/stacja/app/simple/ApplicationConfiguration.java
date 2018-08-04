package it.stacja.app.simple;

import it.stacja.app.factory.model.Tire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"it.stacja.app.factory.model"})
public class ApplicationConfiguration {


}
