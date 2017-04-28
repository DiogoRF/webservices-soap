package br.unisal.soap.service;

import javax.xml.ws.Endpoint;

public class EmissorJMSServicePublisher {

	public static void main(String[] args) {
		EmissorJMSService jmsService = new EmissorJMSService();
		Endpoint.publish("http://localhost:8080/EmissorJMSService?wsdl", jmsService);
	}

}
