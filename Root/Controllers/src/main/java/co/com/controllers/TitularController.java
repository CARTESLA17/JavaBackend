package co.com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.models.dtos.TitularDto;
import co.com.models.responses.TitularResponse;
import co.com.services.TitularService;

@RestController
@RequestMapping("/titular")
public class TitularController{
	
	@Autowired
	private TitularService titularService;
	
	@PostMapping("/almacenarTitular")
	public TitularResponse almacenarTitular(@RequestBody TitularDto titularDto) {
		return titularService.almacenarTitular(titularDto);
	}
	
	@GetMapping("/obtenerTodosLosTitulares")
	public List<TitularDto> obtenerTodosLosTitulares() {		
		return titularService.obtenerTodosLosTitulares();
	}
	
	@PostMapping("/obtenerTitularPorCuit")
	public TitularDto obtenerTitularPorCuit(@RequestBody TitularDto titularDto) {		
		return titularService.obtenerTitularPorCuit(titularDto.getCUIT());
	}
	
	@PostMapping("/eliminarTitularPorId")
	public boolean deleteTitularPorId(@RequestBody TitularDto titularDto) {		
		return titularService.deleteTitularPorId(titularDto.getId());
	}
	
	@PostMapping("/actualizarTitular")
	public TitularResponse actualizarTitular(@RequestBody TitularDto titularDto) {		
		return titularService.actualizarTitular(titularDto);
	}

}