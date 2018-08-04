package it.stacja.app.web.wykop.app;

import it.stacja.app.web.wykop.domain.Wykop;
import it.stacja.app.web.wykop.webapp.CreateWykopRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultWykopService implements WykopService {
    @Override
    public void createWykop(CreateWykopRequest request) {

    }

    @Override
    public List<Wykop> selectAll() {
        return null;
    }
}
