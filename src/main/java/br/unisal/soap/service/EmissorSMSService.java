package br.unisal.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.unisal.soap.impl.EmissorSMS;
import br.unisal.soap.interfaces.Services;

@WebService(endpointInterface="emissorSms")
public class EmissorSMSService {

	@WebMethod(operationName="sendMessage")
	public String sendMessage(String message){
		Services sms = new EmissorSMS(message);
		return sms.execute();
	}
}
