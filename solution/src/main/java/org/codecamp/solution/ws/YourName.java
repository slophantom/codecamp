/**
 * 
 */
package org.codecamp.solution.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author jlholla1
 *
 */

@SuppressWarnings("restriction")
@WebService
public interface YourName {
	@WebMethod
	public String helloWorld(String name);
}
