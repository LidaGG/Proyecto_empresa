package com.ProyectoEmpresa.Repositorios;

import com.ProyectoEmpresa.Entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepositorio extends JpaRepository<Empresa, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
