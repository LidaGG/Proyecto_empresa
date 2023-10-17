package com.ProyectoEmpresa.Controladores;

import com.ProyectoEmpresa.Entidades.Empleado;
import com.ProyectoEmpresa.Repositorios.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleados")
public class ControladorEmpleado {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    // Operación GET para obtener todos los empleados
    @GetMapping
    public List<Empleado> obtenerTodosLosEmpleados() {
        return empleadoRepositorio.findAll();
    }

    // Operación POST para crear un nuevo empleado
    @PostMapping
    public ResponseEntity <Empleado> crearEmpleado(@RequestBody Empleado empleado) {
        Empleado nuevoEmpleado = empleadoRepositorio.save(empleado);
        return ResponseEntity.ok(nuevoEmpleado);
    }

    // Operación GET para obtener un empleado por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Long id) {
        Optional<Empleado> empleado = empleadoRepositorio.findById(id);
        if (empleado.isPresent()) {
            return ResponseEntity.ok(empleado.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Operación PATCH para actualizar un empleado por su ID
    @PatchMapping("/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleadoActualizado) {
        Optional<Empleado> empleadoExistente = empleadoRepositorio.findById(id);
        if (empleadoExistente.isPresent()) {
            Empleado empleado = empleadoExistente.get();
            // Realiza aquí la actualización de los campos necesarios en 'empleado' con los datos de 'empleadoActualizado'
            empleado = empleadoRepositorio.save(empleado);
            return ResponseEntity.ok(empleado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Operación DELETE para eliminar un empleado por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEmpleado(@PathVariable Long id) {
        Optional<Empleado> empleado = empleadoRepositorio.findById(id);
        if (empleado.isPresent()) {
            empleadoRepositorio.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
