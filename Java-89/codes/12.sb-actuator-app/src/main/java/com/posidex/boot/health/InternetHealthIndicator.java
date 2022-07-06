package com.posidex.boot.health;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		Health health = null;
		
		if(checkInternetConnectivity()) {
			health = Health.up().withDetail("connectivity", "Active").build();
		}
		else {
			health = Health.down().withDetail("connectivity", "In-Active").build();
		}
		return health;
	}
	
	private boolean checkInternetConnectivity() {
		try {
			URL u = new URL("https://www.google.com");
			URLConnection con = u.openConnection();
			con.connect();
			return true;
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		return false;
	}
}
