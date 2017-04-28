package br.unisal.soap.service;

import javax.ejb.Stateless;
import javax.jws.WebService;

import br.unisal.soap.impl.EmissorJMS;
import br.unisal.soap.interfaces.IEmissorJMS;

@Stateless
@WebService(
        portName = "EmissorJMSServicePort",
        serviceName = "EmissorJMSService",
        targetNamespace = "http://jetherrodrigues.com/wsdl",
        endpointInterface = "br.unisal.soap.interfaces.IEmissorJMS"
        )
public class EmissorJMSService implements IEmissorJMS{
	@Override
	public String sendMessage(String message) {
		return new EmissorJMS(message).execute();
	}
}
