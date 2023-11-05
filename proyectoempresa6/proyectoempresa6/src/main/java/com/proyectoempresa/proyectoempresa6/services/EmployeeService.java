package com.ProyectoEmpresa.ProyectoEmpresa6.services;

import com.ProyectoEmpresa.ProyectoEmpresa6.entity.Employee;
import com.ProyectoEmpresa.ProyectoEmpresa6.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    // CRUD
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setAge(employee.getAge());
            return employeeRepository.save(existingEmployee);
        } else {
            return null; // Aquí podrías manejar la situación de empleado no encontrado
        }
    }

    public String deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
        return "Has eliminado al empleado con ID: " + id;
    }
}
