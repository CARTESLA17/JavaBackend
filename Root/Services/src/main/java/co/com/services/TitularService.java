package co.com.services;

import java.util.List;
import co.com.models.dtos.TitularDto;
import co.com.models.responses.TitularResponse;

public interface TitularService {
	
	public TitularResponse almacenarTitular(TitularDto titularDto);
	
	public List<TitularDto> obtenerTodosLosTitulares();

	public TitularDto obtenerTitularPorCuit(Long cuit);

	public boolean deleteTitularPorId(Long id);

	public TitularResponse actualizarTitular(TitularDto titularDto);

}