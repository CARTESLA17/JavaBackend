package co.com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.models.dtos.TipoPersonaDto;
import co.com.services.TipoPersonaService;

@RestController
@RequestMapping("/tipoDePersona")
public class TipoPersonaController {
	
	@Autowired
	private TipoPersonaService tipoPersonaService;
	
	@GetMapping("/obtenerTiposDePersona")
	public List<TipoPersonaDto> obtenerTiposDePersona() {		
		return tipoPersonaService.obtenerTiposDePersona();
	}

}
