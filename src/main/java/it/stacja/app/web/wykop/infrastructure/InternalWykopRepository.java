package it.stacja.app.web.wykop.infrastructure;

import it.stacja.app.web.wykop.domain.Wykop;

import java.util.ArrayList;
import java.util.List;

public class InternalWykopRepository implements WykopRepository {

    private List<Wykop> list = new ArrayList<>();


    @Override
    public void save(Wykop wykop) {
        list.add(wykop);

    }

    @Override
    public List<Wykop> findAll() {

        return list;
    }
}
