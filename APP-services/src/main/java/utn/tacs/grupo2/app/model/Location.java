package utn.tacs.grupo2.app.model;

import java.io.Serializable;

public class Location implements Serializable {

	private static final long serialVersionUID = 4298187022990785111L;
	private String address;
	private String latitud;
	private String longitud;

	public Location(){
	}
	
	public Location(String address,String latitud,String longitud){
		this.address=address;
		this.latitud=latitud;
		this.longitud=longitud;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

}
