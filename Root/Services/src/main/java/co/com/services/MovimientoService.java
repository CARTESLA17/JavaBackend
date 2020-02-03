package co.com.services;

import java.util.List;

import co.com.models.dtos.MovimientoDto;

public interface MovimientoService {

	String almacenarMovimiento(MovimientoDto movimientoDto);

	List<MovimientoDto> obtenerMovimientosPorCuenta(Long cuenta);

}
