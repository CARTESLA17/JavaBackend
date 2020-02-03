package co.com.services;

import java.util.List;

import co.com.models.dtos.CuentaDto;

public interface CuentaService {

	String almacenarCuenta(CuentaDto cuentaDto);

	List<CuentaDto> obtenerTodasLasCuentas();

	String eliminarCuentaPorId(Long id);

}
