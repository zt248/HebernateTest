package lesson15_hibernate.service;

import lesson15_hibernate.model.Predmet;

import java.util.List;

public interface PredmetService {

    void create (Predmet predmet);

    Predmet read (Integer id);

    void update(Predmet predmet);

    void delete (Integer id);

    List<Predmet> getAllPredmet();

}
