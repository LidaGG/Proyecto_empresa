package com.ProyectoEmpresa.Repositorios;

import com.ProyectoEmpresa.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
