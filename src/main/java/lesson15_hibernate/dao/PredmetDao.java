package lesson15_hibernate.dao;


import lesson15_hibernate.model.Predmet;

import java.util.List;

public interface PredmetDao {

    void create(Predmet predmet);

    Predmet read(Integer id);

    void update(Predmet predmet);

    void delete(Integer id);

    List<Predmet> getAllPredmet();

}
