package com.ProyectoEmpresa.ProyectoEmpresa6.controllers;

import com.ProyectoEmpresa.ProyectoEmpresa6.entity.Student;
import com.ProyectoEmpresa.ProyectoEmpresa6.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }


    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return studentService.getStudent();
    }

    @GetMapping("/student/{id}")
    public Student findById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }


    @PostMapping("/addStudents")
    public List<Student> saveStudents(@RequestBody List<Student> students){
        return studentService.saveStudents(students);
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }


    @DeleteMapping("deleteStudent/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return studentService.deleteStudent(id);
    }



/*
    @RequestMapping(value = "/student/{id}")
    public Student getStudent(@PathVariable Integer id){
        Student student1 =  new Student();
        student1.setId(id);
        student1.setName("Kevin");
        student1.setAge(12);
        return student1;

    }


    @PostMapping

    public String createStudent(){

        return "Retorna una solicitud http Post";
    }

    @PutMapping
    public String updateStudent(){
        return "Retorna una solicitud http Put";
    }

    @PatchMapping
    public String deleteStudent(){
        return ;
    }


    @DeleteMapping
    public String deleteStudent(){
        return "Retorna una solicitud Http Delete";
    }
*/

}
