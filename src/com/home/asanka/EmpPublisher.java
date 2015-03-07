package com.home.asanka;

import javax.xml.ws.Endpoint;

public class EmpPublisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:3245/ShopMart", new Employee());
	}

}
