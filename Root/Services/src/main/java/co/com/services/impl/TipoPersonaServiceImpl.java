package co.com.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.daos.TipoPersonaRepository;
import co.com.models.dtos.TipoPersonaDto;
import co.com.models.entities.TipoPersona;
import co.com.services.TipoPersonaService;


@Service
public class TipoPersonaServiceImpl implements TipoPersonaService {
	
	@Autowired
	private TipoPersonaRepository tipoPersonaRepository;

	@Override
	public List<TipoPersonaDto> obtenerTiposDePersona() {
		List<TipoPersona> listaTiposPersona = tipoPersonaRepository.findAll();		
		return cargarListaConTipoPersonasDto(listaTiposPersona);
	}
	
	private List<TipoPersonaDto> cargarListaConTipoPersonasDto(List<TipoPersona> listaTiposPersona){
		List<TipoPersonaDto> listaTiposPersonaDto = new ArrayList<>();
		for(TipoPersona tipoPersona: listaTiposPersona){
			TipoPersonaDto tipoPersonaDto = new TipoPersonaDto();
			tipoPersonaDto.setId(tipoPersona.getId());
			tipoPersonaDto.setDescripcion(tipoPersona.getDescripcion());
			listaTiposPersonaDto.add(tipoPersonaDto);
		}
		return listaTiposPersonaDto;
	}

}
