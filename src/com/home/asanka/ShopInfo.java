/**
 * 
 */
package com.home.asanka;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {

	@WebMethod
	@WebResult(partName="propertyResult")
	public String getShopDetail(@WebParam(partName="propertyInput") String property){
		
		if("since".equals(property))
			return "1956";
		else if("where".equals(property))
			return "Colombo";
		
		return "Invalid Property";
	}
}
