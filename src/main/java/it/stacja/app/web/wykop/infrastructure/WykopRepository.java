package it.stacja.app.web.wykop.infrastructure;

import it.stacja.app.web.wykop.domain.Wykop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WykopRepository extends JpaRepository<Wykop, Long> {

    void save(Wykop wykop);

    List<Wykop> findAll();


}
