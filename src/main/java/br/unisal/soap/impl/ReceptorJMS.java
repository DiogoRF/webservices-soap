package br.unisal.soap.impl;

import java.util.Properties;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.jms.ConnectionFactory;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@Singleton
public class ReceptorJMS {

	@Schedule(minute="*")
	public void consumer() {
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
			JMSConsumer jmsConsumer = jmsContext.createConsumer(queue);
			String _message = jmsConsumer.receiveBody(String.class);
						
			System.out.println(_message != null ? "Mensagem recebida: " + _message +"." : "Sem nova mensagem.");
			
			jmsConsumer.close();
			jmsContext.close();

		} catch (NamingException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
