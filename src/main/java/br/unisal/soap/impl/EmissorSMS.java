package br.unisal.soap.impl;

import br.unisal.soap.imports.mobileprontompgateway.MPGateway;
import br.unisal.soap.imports.mobileprontompgateway.MPGatewaySoap;
import br.unisal.soap.interfaces.Services;

public class EmissorSMS implements Services{
	
	private static final String CREDENTIAL = "";
	private static final String TOKEN = "";
	private static final String PRINCIPAL_USER = "";
	private static final String AUX_USER = "";
	private static final String MOBILE = "";
	private static final String SEND_PROJECT = "S";
	private String message;
		
	public EmissorSMS() {
	}

	public EmissorSMS(String message) {
		this.message = message;
	}

	public String execute() {
		MPGateway gateway = new MPGateway();
		MPGatewaySoap proxy = gateway.getMPGatewaySoap();
		
//		MPGSendSMS sendSMS = new MPGSendSMS();
//		sendSMS.setCredencial(CREDENTIAL);
//		sendSMS.setToken(TOKEN);
//		sendSMS.setPrincipalUser(PRINCIPAL_USER);
//		sendSMS.setAuxUser(AUX_USER);
//		sendSMS.setMobile(MOBILE);
//		sendSMS.setSendProject(SEND_PROJECT);
//		sendSMS.setMessage(getMessage());
		
		return proxy.mpgSendSMS(CREDENTIAL, TOKEN, PRINCIPAL_USER, AUX_USER, MOBILE, SEND_PROJECT, getMessage());
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
