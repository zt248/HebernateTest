package lesson15_hibernate.dao;


import lesson15_hibernate.model.Ocenka;

import java.util.List;

public interface OcenkaDao {

    void create(Ocenka ocenka);

    Ocenka read(Integer id);

    void update(Ocenka ocenka);

    void delete(Integer id);

    List<Ocenka> getAllOcenka();

}
