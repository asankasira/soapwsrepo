/**
 * 
 */
package com.home.asanka;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.home.asanka.excep.InvalidInputException;

/**
 * @author Asanka Siriwardena
 *
 */
@WebService
public class Employee {

	@WebMethod
	public String sayHello(String name){		
		return "Welcome, " + name;	
	}
	
	@WebMethod
	public void logSelling(){
		System.out.println("Selling Time Stamp Inlcuded");
	}
	
	@WebMethod
	@WebResult(name="department")
	public String findDepartment(@WebParam(name="lookupKey") String key) throws InvalidInputException{
		
		if("CS".equalsIgnoreCase(key))
			return "Computer";
		else if("ENT".equalsIgnoreCase(key))
			return "Electronics";
		else
			throw new InvalidInputException("Invalid input", key + " is not valid department");
	}
}
