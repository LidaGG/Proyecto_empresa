package com.ProyectoEmpresa.Servicios;

import com.ProyectoEmpresa.Entidades.Empresa;
import com.ProyectoEmpresa.Repositorios.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServicioImpl implements EmpresaServicio {

    @Autowired
    private EmpresaRepositorio empresaRepositorio;

    @Override
    public List<Empresa> obtenerTodasLasEmpresas() {
        return empresaRepositorio.findAll();
    }

    @Override
    public Optional<Empresa> obtenerEmpresaPorId(Long id) {
        return empresaRepositorio.findById(id);
    }

    @Override
    public Empresa crearEmpresa(Empresa empresa) {
        return empresaRepositorio.save(empresa);
    }

    @Override
    public Empresa editarEmpresa(Long id, Empresa empresa) {
        empresa.setId(id);
        return empresaRepositorio.save(empresa);
    }

    @Override
    public void eliminarEmpresa(Long id) {
        empresaRepositorio.deleteById(id);
    }
}
