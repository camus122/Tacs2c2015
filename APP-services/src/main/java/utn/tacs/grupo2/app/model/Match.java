package utn.tacs.grupo2.app.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

public class Match implements Serializable {

	private static final long serialVersionUID = 1183638360080914911L;

	private String id;
	private String sport;
	private String title;
	private int maxCapacity;
	private int startingLineupQuantity;
	private Date dateTime;
	private Location location;
	private List<User> registeredUsers;
	//private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
	//private SimpleDateFormat timeFormat = new SimpleDateFormat("HH:MM");

	
	public Match() {
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDate(Date dateTime) {
		this.dateTime = dateTime;
	}
	


	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setRegisteredUsers(List<User> registeredUsers) {
		this.registeredUsers = registeredUsers;
	}

//	@ModelAttribute
//	public String getDate() {
//		return dateFormat.format(dateTime);
//	}
//	
//	@ModelAttribute
//	public String getTime() {
//		return timeFormat.format(dateTime);
//	}
	
	@Override
	public boolean equals(Object obj) {
		Match otherObj = (Match) obj;
		return this.getId().equals(otherObj.getId());
	}

	@Override
	public int hashCode() {
		return this.getId().hashCode();
	}
}
