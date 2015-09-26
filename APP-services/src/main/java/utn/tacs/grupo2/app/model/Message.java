package utn.tacs.grupo2.app.model;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = -6292776824073144978L;
	private Object body;
	private Error error;

	public Message() {
	}

	public Message(Object body, Error causaError) {
		this.body = body;
		this.error = causaError;
	}

	public Message(Object body) {
		this.body = body;
	}

	public boolean hasError() {
		return error != null;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

}
