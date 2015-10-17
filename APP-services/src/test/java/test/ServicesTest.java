package test;

import org.junit.Assert;
import org.junit.Test;
import org.json.simple.JSONObject;

public class ServicesTest {

	@Test
	public void GetMatchesTest() {
		String url = "http://localhost:8080/APP/#/home";
		int responseCode = 0;
		int expectedResponse = 200;
		HttpConnection http = new HttpConnection();
		try {
			responseCode = http.sendGet(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(responseCode, expectedResponse);
}
	
	@Test
	public void GetRecommendedMatchesTest() {

		String url = "/APP/users/me/recommended/matches";
		int responseCode = 0;
		int expectedResponse = 200;
		HttpConnection http = new HttpConnection();
		try {
			responseCode = http.sendGet(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertNotEquals(responseCode, expectedResponse);
}
	
	@Test
	public void CreateMalformedMatchTest() {
		int responseCode = 0;
		int expectedResponse = 200;
		String url = "http://localhost:8080/APP/matches";
		JSONObject postParams = new JSONObject();
		JSONObject location = new JSONObject();
		location.put("address", "Medrano 905");
		postParams.put("title", "test1");
		postParams.put("sport", "futbol");
		postParams.put("startingLineupQuantity", 11);
		postParams.put("maxCapacity", 5);
		postParams.put("location", location);
		System.out.println("Post params : " + postParams.toString());
		
		HttpConnection http = new HttpConnection();
		try {
			responseCode = http.sendPost(url, postParams);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Response Code : " + responseCode);
		System.out.println("Expected Code : " + expectedResponse);
		Assert.assertNotEquals(responseCode, expectedResponse);
		
}

	@Test
	public void DeleteNotExistingRecommendedMatchTest() {
		String url = "/APP/matches/recommended/1";
		int responseCode = 0;
		int expectedResponse = 200;
		HttpConnection http = new HttpConnection();
		try {
			responseCode = http.sendDelete(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertNotEquals(responseCode, expectedResponse);
}
	
	
}


