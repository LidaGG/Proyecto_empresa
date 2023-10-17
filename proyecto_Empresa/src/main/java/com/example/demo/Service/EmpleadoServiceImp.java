package com.example.demo.Service;

import com.example.demo.Entidades.Empleado;
import com.example.demo.Repository.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImp implements EmpleadoService{

    @Autowired
    private final EmpleadoRepositorio repositorio;

    public EmpleadoServiceImp(EmpleadoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return repositorio.save(empleado);
    }
}
