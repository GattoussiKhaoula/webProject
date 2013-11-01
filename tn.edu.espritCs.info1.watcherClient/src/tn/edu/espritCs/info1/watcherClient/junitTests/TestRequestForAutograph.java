package tn.edu.espritCs.info1.watcherClient.junitTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessRemote;

public class TestRequestForAutograph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			IncidentBusinessRemote proxy = (IncidentBusinessRemote) context
					.lookup("ejb:/tn.edu.espritCs.info1.watcher/IncidentBusiness!tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessRemote");

			proxy.doAutograph();
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
