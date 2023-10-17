package com.example.demo.Controller;

import com.example.demo.Entidades.Empleado;
import com.example.demo.Service.EmpleadoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    private final EmpleadoServiceImp service;

    @Autowired
    public EmpleadoController(EmpleadoServiceImp service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Empleado> guardarEmpleado(@RequestBody Empleado empleado){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.guardarEmpleado(empleado));
    }
}
