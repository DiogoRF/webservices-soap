package br.unisal.soap.service;

import javax.xml.ws.Endpoint;

public class CalculadoraPublisher {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		Endpoint.publish("http://localhost:8080/calculadora?wsdl", calculadora);
	}

}
