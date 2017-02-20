package lesson15_hibernate.dao.impl;

import lesson15_hibernate.dao.PredmetDao;
import lesson15_hibernate.model.Predmet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PredmetDaoImpl implements PredmetDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(Predmet predmet) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(predmet);
    }

    @Override
    public Predmet read(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        Predmet predmet = (Predmet) session.get(Predmet.class, new Integer(id));
        return predmet;
    }

    @Override
    public void update(Predmet predmet) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(predmet);
    }

    @Override
    public void delete(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        Predmet predmet = (Predmet) session.get(Predmet.class, new Integer(id));
        if(predmet != null){
            session.delete(predmet);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Predmet> getAllPredmet() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Predmet> predmetList = session.createQuery("from Predmet").list();
        return predmetList;
    }
}
