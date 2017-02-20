package lesson15_hibernate.dao.impl;


import lesson15_hibernate.dao.OcenkaDao;
import lesson15_hibernate.dao.StudentDao;
import lesson15_hibernate.model.Ocenka;
import lesson15_hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OcenkaDaoImpl implements OcenkaDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(Ocenka ocenka) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(ocenka);
    }

    @Override
    public Ocenka read(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        Ocenka ocenka = (Ocenka) session.get(Ocenka.class, new Integer(id));
        return ocenka;
    }

    @Override
    public void update(Ocenka ocenka) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(ocenka);
    }

    @Override
    public void delete(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        Ocenka ocenka = (Ocenka) session.get(Ocenka.class, new Integer(id));
        if (ocenka != null){
            session.delete(ocenka);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Ocenka> getAllOcenka() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Ocenka> ocenkaList = session.createQuery("from Ocenka").list();
        return ocenkaList;
    }
}
