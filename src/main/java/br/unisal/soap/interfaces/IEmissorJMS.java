package br.unisal.soap.interfaces;

import javax.jws.WebService;

@WebService(targetNamespace = "http://jetherrodrigues.com/wsdl")
public interface IEmissorJMS {
	String sendMessage(String message); 
}
