package com.ProyectoEmpresa.Controladores;

import com.ProyectoEmpresa.Entidades.ManejoDinero;
import com.ProyectoEmpresa.Repositorios.ManejoDineroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enterprises/{id}/movements")
public class ControladorManejoDinero {

    @Autowired
    private ManejoDineroRepositorio manejoDineroRepositorio;

    // Operación GET para obtener todos los movimientos de dinero de una empresa específica
    @GetMapping
    public List<ManejoDinero> obtenerMovimientosDeDinero(@PathVariable Long id) {
        // Aquí, debes implementar la lógica para obtener los movimientos de dinero de la empresa con ID 'id'
        // Utiliza el 'id' para filtrar los movimientos de dinero de esa empresa.
        List<ManejoDinero> movimientos = manejoDineroRepositorio.findByEmpresaId(id);
        return movimientos;
    }

    // Operación POST para crear un nuevo movimiento de dinero en una empresa específica
    @PostMapping
    public ResponseEntity<ManejoDinero> crearMovimientoDeDinero(@PathVariable Long id, @RequestBody ManejoDinero movimiento) {
        // Aquí, debes implementar la lógica para crear un nuevo movimiento de dinero en la empresa con ID 'id'
        // Asegúrate de establecer el ID de la empresa en el movimiento.
        movimiento.setEmpresaId(id);
        ManejoDinero nuevoMovimiento = manejoDineroRepositorio.save(movimiento);
        return ResponseEntity.ok(nuevoMovimiento);
    }

    // Operación GET para obtener un movimiento de dinero por su ID en una empresa específica
    @GetMapping("/{movimientoId}")
    public ResponseEntity<ManejoDinero> obtenerMovimientoDeDinero(@PathVariable Long id, @PathVariable Long movimientoId) {
        // Aquí, debes implementar la lógica para obtener un movimiento de dinero específico de la empresa con ID 'id'
        Optional<ManejoDinero> movimiento = manejoDineroRepositorio.findById(movimientoId);
        if (movimiento.isPresent() && movimiento.get().getEmpresaId() == id) {
            return ResponseEntity.ok(movimiento.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Operación PATCH para actualizar un movimiento de dinero por su ID en una empresa específica
    @PatchMapping("/{movimientoId}")
    public ResponseEntity<ManejoDinero> actualizarMovimientoDeDinero(@PathVariable Long id, @PathVariable Long movimientoId, @RequestBody ManejoDinero movimientoActualizado) {
        // Aquí, debes implementar la lógica para actualizar un movimiento de dinero específico de la empresa con ID 'id'
        Optional<ManejoDinero> movimientoExistente = manejoDineroRepositorio.findById(movimientoId);
        if (movimientoExistente.isPresent() && movimientoExistente.get().getEmpresaId() == id) {
            ManejoDinero movimiento = movimientoExistente.get();
            // Realiza aquí la actualización de los campos necesarios en 'movimiento' con los datos de 'movimientoActualizado'
            movimiento = manejoDineroRepositorio.save(movimiento);
            return ResponseEntity.ok(movimiento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Operación DELETE para eliminar un movimiento de dinero por su ID en una empresa específica
    @DeleteMapping("/{movimientoId}")
    public ResponseEntity<Void> eliminarMovimientoDeDinero(@PathVariable Long id, @PathVariable Long movimientoId) {
        // Aquí, debes implementar la lógica para eliminar un movimiento de dinero específico de la empresa con ID 'id'
        Optional<ManejoDinero> movimiento = manejoDineroRepositorio.findById(movimientoId);
        if (movimiento.isPresent() && movimiento.get().getEmpresaId() == id) {
            manejoDineroRepositorio.deleteById(movimientoId);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
