package br.unisal.soap.impl;

import java.util.Properties;

import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.unisal.soap.interfaces.IServices;

public class EmissorJMS implements IServices {

	private String mensagem;

	public EmissorJMS(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String execute() {
		String _response = null;
		
		Properties properties = new Properties();
		properties.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
		properties.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
		properties.setProperty("java.naming.factory.state",
				"com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");

		try {
			InitialContext context = new InitialContext(properties);
			ConnectionFactory factory = (ConnectionFactory) context.lookup("jms/__sendMessageConnectionFactory");
			
			Queue queue = (Queue) context.lookup("jms/__sendMessage");
			
			JMSContext jmsContext = factory.createContext();
			JMSProducer jmsProducer = jmsContext.createProducer();
			jmsProducer.send(queue, getMensagem());
			
			jmsContext.close();
			
			_response = "JMS enviada com sucesso.";
		} catch (NamingException e) {
			_response = "Erro em enviar a JMS.";
		}

		return _response;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
