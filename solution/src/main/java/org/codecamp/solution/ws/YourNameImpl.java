package org.codecamp.solution.ws;

import javax.jws.WebService;

@SuppressWarnings("restriction")
@WebService(endpointInterface = "org.codecamp.solution.ws.YourName")
public class YourNameImpl implements YourName {
	@Override
	public String helloWorld(String name) {
		StringBuffer sb = new StringBuffer().append("Hello, ").append(name);
		return sb.toString();
	}

}
