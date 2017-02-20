package lesson15_hibernate.service;


import lesson15_hibernate.model.Student;

import java.util.List;

public interface StudentService {

    void create (Student student);

    void update (Student student);

    Student read (Integer id);

    void delete (Integer id);

    List<Student> getAllStudent();

}
