package co.com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.models.dtos.CuentaDto;
import co.com.services.CuentaService;

@RestController
@RequestMapping("/cuenta")
public class CuentaController {
	
	@Autowired
	private CuentaService cuentaService;
	
	@PostMapping("/almacenarCuenta")
	public String almacenarCuenta(@RequestBody CuentaDto cuentaDto) {
		return cuentaService.almacenarCuenta(cuentaDto);
	}
	
	@GetMapping("/obtenerTodasLasCuentas")
	public List<CuentaDto> obtenerTodasLasCuentas() {		
		return cuentaService.obtenerTodasLasCuentas();
	}
	
	@PostMapping("/eliminarCuentaPorId")
	public String eliminarCuentaPorId(@RequestBody CuentaDto cuentaDto) {		
		return cuentaService.eliminarCuentaPorId(cuentaDto.getId());
	}

}
