package co.com.models.responses;

import java.io.Serializable;

public class TestResponse implements Serializable{
	
	private static final long serialVersionUID = 6153179523379923852L;
	
	private String message;

	public TestResponse() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
