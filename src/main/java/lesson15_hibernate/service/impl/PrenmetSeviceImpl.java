package lesson15_hibernate.service.impl;

import lesson15_hibernate.dao.PredmetDao;
import lesson15_hibernate.model.Predmet;
import lesson15_hibernate.service.PredmetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PrenmetSeviceImpl implements PredmetService {

    @Autowired
    private PredmetDao predmetDao;

    public void setPredmetDao(PredmetDao predmetDao) {
        this.predmetDao = predmetDao;
    }

    @Override
    public void create(Predmet predmet) {
        this.predmetDao.create(predmet);
    }

    @Override
    public Predmet read(Integer id) {
        return this.predmetDao.read(id);
    }

    @Override
    public void update(Predmet predmet) {
        this.predmetDao.update(predmet);
    }

    @Override
    public void delete(Integer id) {
        this.predmetDao.delete(id);
    }

    @Override
    public List<Predmet> getAllPredmet() {
        return this.predmetDao.getAllPredmet();
    }
}
