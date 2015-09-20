package utn.tacs.grupo2.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Match implements Serializable {

	private static final long serialVersionUID = 1183638360080914911L;

	private String sport;
	private int maxCapacity;
	private int startingLineupQuantity;
	private List<User> registeredUsers;
	
	public Match(){
		registeredUsers = new ArrayList<User>();
	}

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
	
	public List<User> getRegisteredUsers() {
		return registeredUsers;
	}
	
	public void addUser(User user) {
		registeredUsers.add(user);
	}
	

}
