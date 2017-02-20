package lesson15_hibernate.service;

import lesson15_hibernate.model.Ocenka;

import java.util.List;

public interface OcenkaService {

    void create (Ocenka ocenka);

    Ocenka read (Integer id);

    void update (Ocenka ocenka);

    void delete (Integer id);

    List<Ocenka> getAllOcenka();


}
