package com.ProyectoEmpresa.Servicios;

import com.ProyectoEmpresa.Entidades.ManejoDinero;
import com.ProyectoEmpresa.Repositorios.ManejoDineroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManejoDineroServicioImpl extends ManejoDineroServicio {

    private final ManejoDineroRepositorio manejoDineroRepositorio;

    @Autowired
    public ManejoDineroServicioImpl(ManejoDineroRepositorio manejoDineroRepositorio) {
        super();
        this.manejoDineroRepositorio = manejoDineroRepositorio;
    }

    @Override
    public List<ManejoDinero> obtenerMovimientosDeDinero(Long empresaId) {
        // Implementa la lógica para obtener los movimientos de dinero de una empresa específica (empresaId)
        return manejoDineroRepositorio.findByEmpresaId(empresaId);
    }

    @Override
    public Optional<ManejoDinero> obtenerMovimientoDeDinero(Long empresaId, Long movimientoId) {
        // Implementa la lógica para obtener un movimiento de dinero específico por su ID (movimientoId)
        return manejoDineroRepositorio.findById(movimientoId);
    }

    @Override
    public ManejoDinero crearMovimientoDeDinero(Long empresaId, ManejoDinero movimiento) {
        // Implementa la lógica para crear un nuevo movimiento de dinero en una empresa específica (empresaId)
        movimiento.setEmpresaId(empresaId);
        return manejoDineroRepositorio.save(movimiento);
    }

    @Override
    public ManejoDinero actualizarMovimientoDeDinero(Long empresaId, Long movimientoId, ManejoDinero movimientoActualizado) {
        // Implementa la lógica para actualizar un movimiento de dinero específico (movimientoId) en una empresa específica (empresaId)
        Optional<ManejoDinero> movimientoExistente = manejoDineroRepositorio.findById(movimientoId);
        if (movimientoExistente.isPresent() && movimientoExistente.get().getEmpresaId().equals(empresaId)) {
            ManejoDinero movimiento = movimientoExistente.get();
            // Actualiza los campos del movimiento con los valores de movimientoActualizado
            // Puedes implementar la lógica específica aquí
            movimiento.setMonto(movimientoActualizado.getMonto());
            movimiento.setConcepto(movimientoActualizado.getConcepto());
            movimiento.setEncargado(movimientoActualizado.getEncargado());
            return manejoDineroRepositorio.save(movimiento);
        } else {
            return null; // O manejar el caso de no encontrado
        }
    }

    @Override
    public void eliminarMovimientoDeDinero(Long empresaId, Long movimientoId) {
        // Implementa la lógica para eliminar un movimiento de dinero específico (movimientoId) en una empresa específica (empresaId)
        manejoDineroRepositorio.deleteById(movimientoId);
    }
}
