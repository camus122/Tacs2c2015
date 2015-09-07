package utn.tacs.grupo2.app.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -1391670278447453765L;
	private String name;
	private String lastName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
