package br.unisal.soap.service;

import javax.xml.ws.Endpoint;

public class EmissorSMSServicePublisher {

	public static void main(String[] args) {
		EmissorSMSService smsService = new EmissorSMSService();
		Endpoint.publish("http://localhost:8080/EmissorJMSService?wsdl", smsService);
	}

}
