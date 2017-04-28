package br.unisal.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="calculadora")
public class Calculadora {
	
	@WebMethod(operationName="soma")
	public double getSoma(double v1, double v2) {
		return v1 + v2;
	}
}
