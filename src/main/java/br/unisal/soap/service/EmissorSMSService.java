package br.unisal.soap.service;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.unisal.soap.impl.EmissorSMS;
import br.unisal.soap.interfaces.IEmissorSMS;
import br.unisal.soap.interfaces.IServices;

@Stateless
@WebService(
        portName = "EmissorSMSServicePort",
        serviceName = "EmissorSMSService",
        targetNamespace = "http://jetherrodrigues.com/wsdl",
        endpointInterface = "br.unisal.soap.interfaces.IEmissorSMS"
        )
public class EmissorSMSService implements IEmissorSMS{
	@Override
	public String sendMessage(String message) {
		return new EmissorSMS(message).execute();
	}
}
