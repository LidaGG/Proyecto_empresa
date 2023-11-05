package com.ProyectoEmpresa.ProyectoEmpresa6.repository;
import com.ProyectoEmpresa.ProyectoEmpresa6.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {


}
