package co.com.models.responses;

import java.io.Serializable;

import co.com.models.dtos.TitularDto;

public class TitularResponse implements Serializable{
	
	private static final long serialVersionUID = 1169067930898341943L;
	
	private boolean success =false;
	
	private TitularDto titularDto;	

	public TitularResponse() {
		super();
	}

	public TitularDto getTitularDto() {
		return titularDto;
	}

	public void setTitularDto(TitularDto titularDto) {
		this.titularDto = titularDto;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
}
