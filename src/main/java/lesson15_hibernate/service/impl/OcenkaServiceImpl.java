package lesson15_hibernate.service.impl;

import lesson15_hibernate.dao.OcenkaDao;
import lesson15_hibernate.model.Ocenka;
import lesson15_hibernate.service.OcenkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OcenkaServiceImpl implements OcenkaService {

    @Autowired
    private OcenkaDao ocenkaDao;

    public void setOcenkaDao(OcenkaDao ocenkaDao) {
        this.ocenkaDao = ocenkaDao;
    }

    @Override
    public void create(Ocenka ocenka) {
        this.ocenkaDao.create(ocenka);
    }

    @Override
    public Ocenka read(Integer id) {
        return this.ocenkaDao.read(id);
    }

    @Override
    public void update(Ocenka ocenka) {
        this.ocenkaDao.update(ocenka);
    }

    @Override
    public void delete(Integer id) {
        this.ocenkaDao.delete(id);
    }

    @Override
    public List<Ocenka> getAllOcenka() {
        return this.ocenkaDao.getAllOcenka();
    }
}
