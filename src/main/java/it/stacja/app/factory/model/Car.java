package it.stacja.app.factory.model;

import com.google.common.collect.Lists;
import it.stacja.app.factory.context.Component;
import it.stacja.app.factory.context.Prototype;

import java.util.List;

@Component
@Prototype
public class Car {

    private List<Wheel> wheels;

    public Car(Wheel pp,Wheel pl, Wheel tp, Wheel tl){
        wheels = Lists.newArrayList(pp,pl,tp,tl);
    }


}
