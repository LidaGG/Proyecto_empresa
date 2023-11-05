package com.ProyectoEmpresa.ProyectoEmpresa6.services;


import com.ProyectoEmpresa.ProyectoEmpresa6.entity.Student;
import  com.ProyectoEmpresa.ProyectoEmpresa6.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    //CRUD
    @Autowired
    private  StudentRepository studentRepository;

    public List<Student> getStudent(){
        return studentRepository.findAll();

    }

    public Student getStudentById(Integer id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return studentRepository.saveAll(students);
    }


    public Student updateStudent(Student student){
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        return studentRepository.save(existingStudent);
    }



    public String deleteStudent(Integer id){
        studentRepository.deleteById(id);
        return "Has eliminado al estudiante con id: "+ id;
    }


}
