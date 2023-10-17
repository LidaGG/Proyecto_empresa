package com.ProyectoEmpresa.Servicios;

import com.ProyectoEmpresa.Entidades.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoServicio {
    List<Empleado> obtenerTodosLosEmpleados();
    Optional<Empleado> obtenerEmpleadoPorId(Long id);
    Empleado crearEmpleado(Empleado empleado);
    Empleado editarEmpleado(Long id, Empleado empleado);
    void eliminarEmpleado(Long id);
}
