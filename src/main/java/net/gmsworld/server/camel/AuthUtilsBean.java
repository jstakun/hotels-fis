package net.gmsworld.server.camel;

import java.util.Base64;
import java.util.logging.Logger;

import org.apache.camel.Exchange;

public class AuthUtilsBean {

	Logger logger = Logger.getLogger(AuthUtilsBean.class.getName());
	
	public String getUsername(Exchange exchange) {
		String user = "anonymous";
		final String basicAuthHeader = (String)exchange.getIn().getHeader("authorization");
        if (basicAuthHeader != null && basicAuthHeader.startsWith("Basic")) {
        	logger.info("Found authorization header");
    		byte[] decodedBytes = Base64.getDecoder().decode(basicAuthHeader.split(" ")[1]);
			user = new String(decodedBytes).split(":")[0];
		}
		return user.substring(0, 2) + "***";
	}
}
