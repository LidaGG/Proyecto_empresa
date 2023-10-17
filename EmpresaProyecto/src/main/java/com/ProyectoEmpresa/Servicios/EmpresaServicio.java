package com.ProyectoEmpresa.Servicios;

import com.ProyectoEmpresa.Entidades.Empresa;

import java.util.List;
import java.util.Optional;

public interface EmpresaServicio {
    List<Empresa> obtenerTodasLasEmpresas();
    Optional<Empresa> obtenerEmpresaPorId(Long id);
    Empresa crearEmpresa(Empresa empresa);
    Empresa editarEmpresa(Long id, Empresa empresa);
    void eliminarEmpresa(Long id);
}
