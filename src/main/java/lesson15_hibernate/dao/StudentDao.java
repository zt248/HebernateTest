package lesson15_hibernate.dao;


import lesson15_hibernate.model.Student;

import java.util.List;

public interface StudentDao {

    void create (Student student);

    Student read (Integer id);

    void update (Student student);

    void delete (Integer id);

    List<Student> getAllStudent();

}
