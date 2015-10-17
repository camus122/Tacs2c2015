package test;

import test.*;
import utn.tacs.grupo2.app.services.*;
import junit.framework.Assert;
import org.junit.Test;

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

}


