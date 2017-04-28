package br.unisal.soap.service;

import javax.xml.ws.Endpoint;

public class CalculadoraServicePublisher {

	public static void main(String[] args) {
		CalculadoraService calculadora = new CalculadoraService();
		Endpoint.publish("http://localhost:8080/calculadora?wsdl", calculadora);
	}

}
