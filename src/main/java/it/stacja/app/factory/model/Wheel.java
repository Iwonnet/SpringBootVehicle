package it.stacja.app.factory.model;

import it.stacja.app.factory.context.Component;

@Component
public class Wheel {
    private Tire tire;

    public Wheel(Tire tire) {
        this.tire = tire;
    }
}
