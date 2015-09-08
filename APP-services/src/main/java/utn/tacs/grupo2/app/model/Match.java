package utn.tacs.grupo2.app.model;

import java.io.Serializable;

public class Match implements Serializable {

	private static final long serialVersionUID = 1183638360080914911L;

	private String sport;
	private int maxCapacity;
	private int startingLineupQuantity;

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public int getStartingLineupQuantity() {
		return startingLineupQuantity;
	}

	public void setStartingLineupQuantity(int startingLineupQuantity) {
		this.startingLineupQuantity = startingLineupQuantity;
	}

}
