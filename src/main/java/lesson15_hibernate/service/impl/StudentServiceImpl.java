package lesson15_hibernate.service.impl;

import lesson15_hibernate.dao.StudentDao;
import lesson15_hibernate.model.Student;
import lesson15_hibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void create(Student student) {
        this.studentDao.create(student);
    }

    @Override
    public void update(Student student) {
        this.studentDao.update(student);
    }

    @Override
    public Student read(Integer id) {
        return this.studentDao.read(id);
    }

    @Override
    public void delete(Integer id) {
        this.studentDao.delete(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return this.studentDao.getAllStudent();
    }
}
