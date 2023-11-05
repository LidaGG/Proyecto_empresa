package com.ProyectoEmpresa.ProyectoEmpresa6.controllers;
import com.ProyectoEmpresa.ProyectoEmpresa6.entity.Employee;
import com.ProyectoEmpresa.ProyectoEmpresa6.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> findAllEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee findById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/addEmployees")
    public List<Employee> saveEmployees(@RequestBody List<Employee> employees){
        return employeeService.saveEmployees(employees);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
        return employeeService.deleteEmployee(id);
    }
}
