package utn.tacs.grupo2.app.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utn.tacs.grupo2.app.model.Location;
import utn.tacs.grupo2.app.model.Match;
import utn.tacs.grupo2.app.model.User;

@SuppressWarnings("unchecked")
public class ObjectMemoryRepository implements Serializable{

	private static final String KEY_USERS = "KEY_USERS";
	private static final String KEY_MATCHES = "KEY_MATCHES";
	private static final String KEY_FRIEND_MATCHES = "KEY_FRIEND_MATCHES";
	private static final String KEY_RECOMENDED_MATCHES = "KEY_RECOMENDED_MATCHES";

	private static final long serialVersionUID = -7822968562651078679L;
	
	private static Map<String,Object> repository=new HashMap<String, Object>();
	
	static{
		repository.put(KEY_USERS, new ArrayList<User>());
		repository.put(KEY_MATCHES, new ArrayList<Match>());
		repository.put(KEY_FRIEND_MATCHES, new ArrayList<Match>());
		repository.put(KEY_RECOMENDED_MATCHES, crearListaRecomendados());
	}
	
	public static List<User> getUsers(){
		return (List<User>) repository.get(KEY_USERS);
	}
	
	public static List<Match> getMatches(){
		return (List<Match>) repository.get(KEY_MATCHES);
	}

	public static List<Match> getFriendMatches(){
		return (List<Match>) repository.get(KEY_MATCHES);
	}
	
	public static List<Match> getRecomendedMatches(){
		return (List<Match>) repository.get(KEY_RECOMENDED_MATCHES);
	}
	
	public static List<Match> crearListaRecomendados(){
		List<Match> recomendados=new ArrayList<Match>();
		User user=new User();
		user.setName("Juan");
		user.setLastName("Poncho");
		User user2=new User();
		user2.setName("Pancho");
		user2.setLastName("Suarez");
		User user3=new User();
		user3.setName("Guillermo");
		user3.setLastName("Pepon");
		User user4=new User();
		user4.setName("Hideo");
		user4.setLastName("Kojima");
		User user5=new User();
		user5.setName("Troy");
		user5.setLastName("Baker");
		
		
		Match m1 = new Match();
		m1.setId("0");
		m1.setMaxCapacity(22);
		m1.setTitle("Cumple de fer");
		m1.setStartingLineupQuantity(23);
		m1.setSport("Voley");;
		m1.addUser(user4);
		m1.addUser(user5);
		m1.addUser(user);
		m1.setLocation(new Location());
		m1.setLocation(new Location("casa", "0", "0"));
		recomendados.add(m1);
		
		Match m2 = new Match();
		m2.setId("1");
		m2.setTitle("Congresista despedido");
		m2.setMaxCapacity(22);
		m2.setStartingLineupQuantity(23);
		m2.setLocation(new Location("Un lugar", "40", "-35"));
		m2.setSport("Fulbo");;
		m2.addUser(user2);
		m2.addUser(user3);
		m2.addUser(user4);
		recomendados.add(m2);
		
		return recomendados;
	}	
}
