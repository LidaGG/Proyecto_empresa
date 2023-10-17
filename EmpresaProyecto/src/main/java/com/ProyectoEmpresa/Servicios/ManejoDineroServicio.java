import com.ProyectoEmpresa.Entidades.ManejoDinero;

import java.util.List;
import java.util.Optional;

public interface ManejoDineroServicio {
    List<ManejoDinero> obtenerMovimientosDeDinero(Long empresaId);

    Optional<ManejoDinero> obtenerMovimientoDeDinero(Long empresaId, Long movimientoId);

    ManejoDinero crearMovimientoDeDinero(Long empresaId, ManejoDinero movimiento);

    ManejoDinero actualizarMovimientoDeDinero(Long empresaId, Long movimientoId, ManejoDinero movimientoActualizado);
void eliminarMovimientoDeDinero(Long empresaId, Long movimientoId);
}
