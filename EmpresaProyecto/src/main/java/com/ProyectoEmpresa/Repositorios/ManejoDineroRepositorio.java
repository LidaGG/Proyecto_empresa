package com.ProyectoEmpresa.Repositorios;

import com.ProyectoEmpresa.Entidades.ManejoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManejoDineroRepositorio extends JpaRepository<ManejoDinero, Long> {
    List<ManejoDinero> findByEmpresaId(Long empresaId);
    // Aquí puedes agregar métodos personalizados si es necesario
}
