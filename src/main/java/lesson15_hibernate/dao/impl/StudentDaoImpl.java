package lesson15_hibernate.dao.impl;


import lesson15_hibernate.dao.StudentDao;
import lesson15_hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void create(Student student) {
        this.sessionFactory.getCurrentSession().save(student);
    }


    @Override
    public Student read(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        Student student = (Student) session.get(Student.class, new Integer(id));
        return student;
    }

    @Override
    public void update(Student student) {
        this.sessionFactory.getCurrentSession().update(student);
    }

    @Override
    public void delete(Integer id) {
        Student student = (Student) sessionFactory.getCurrentSession().load(Student.class, id);
        if (null != student) {
            this.sessionFactory.getCurrentSession().delete(student);
        }

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Student> getAllStudent() {
        return this.sessionFactory.getCurrentSession().createQuery("from Student").list();
    }
}
