package it.stacja.app.factory.model;

import com.google.common.collect.Lists;

import java.util.List;

public class Car {

    private List<Wheel> wheels;

    public Car(Wheel pp,Wheel pl, Wheel tp, Wheel tl){
        wheels = Lists.newArrayList(pp,pl,tp,tl);
    }


}
