package lesson15_hibernate.controller;

import lesson15_hibernate.model.Student;
import lesson15_hibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/student")
//@Configuration
//@ComponentScan("lesson15_hibernate.controller")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
/*Отображение всех студентов*/
    @RequestMapping(value = "getAllStudent")
    public String getAllStudent(Model model) {
        model.addAttribute("command", new Student());
        model.addAttribute("studentList", studentService.getAllStudent());
        return "student/allStudents";
    }
/*Отображение студента по Id*/
    @RequestMapping(value = "getStudentById/{id}", method = RequestMethod.GET)
    public String getStudentById(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("studentId",studentService.read(id));
        return "student/studentById";
    }

/*удаление студента по Id*/
    @RequestMapping(value = "getStudentIdDelete/{id}")
    public String getStudentIdDelete(@PathVariable("id") Integer id){
        studentService.delete(id);
        return "redirect:/student/getAllStudent";
    }
/*добавление студента*/
    @RequestMapping(value = "addStudent", method = RequestMethod.GET)
    public ModelAndView addStudent(){
        return new ModelAndView("student/addStudent","command", new Student());
    }

    @RequestMapping(value = "addSt", method = RequestMethod.POST)
    public String addSt (Student student){
        studentService.create(student);
        return "redirect:/student/getAllStudent";
    }

/*добавление студента с помощью Ajax*/
    @RequestMapping(value = "/addSt-ajax", method = RequestMethod.POST)
    @ResponseBody
    public String addStudentAjax(Student student) {
        studentService.create(student);
//        return "redirect:/student/students";
        return student.toString();
    }


    /*@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("command") Student student){
        if(student.getId() == 0){
            studentService.create(student);
        }else {
            studentService.update(student);
        }
        return "redirect:/student/getAllStudent";
    }*/
/*обновление студента*/
    @RequestMapping("update/{id}")
    public String upSt(@PathVariable("id") Integer id, Model model){
        model.addAttribute("command", studentService.read(id));
//        model.addAttribute("listStudent", studentService.getAllStudent());
        return "/student/updateStudent";
    }

    @RequestMapping(value = "updateStudent", method = RequestMethod.POST)
    public String updatetudent(Model model, Student student){
//        model.addAttribute("listStudent", studentService.getAllStudent());
        studentService.update(student);
        return "redirect:/student/getAllStudent";
    }

/*переход ко всем студентам*/

    @RequestMapping(value = "redir", method = RequestMethod.GET)
    public String redir(){
        return "redirect:/student/getAllStudent";
    }



}
