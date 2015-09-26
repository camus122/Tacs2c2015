package utn.tacs.grupo2.app.model;

import java.io.Serializable;

public class Error implements Serializable{
	private static final long serialVersionUID = 2926676613233153003L;
	private String causa;

	public Error(String causa){
		this.causa=causa;
	}

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}
	
	
}
