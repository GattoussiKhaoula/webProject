package tn.edu.espritCs.info1.watcherClient.junitTests;

import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessRemote;
import tn.edu.espritCs.info1.watcher.domain.Incident;

public class TestInitPlatforme {

	private Context context;
	private IncidentBusinessRemote incidentBusinessRemote;

	@Before
	public void initPlatform() {

		try {
			context = new InitialContext();
			incidentBusinessRemote = (IncidentBusinessRemote) context
					.lookup("ejb:/tn.edu.espritCs.info1.watcher/IncidentBusiness!tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessRemote");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testAddIncident() {
		Incident incident = new Incident();
		incident.setIdIncident(1);
		incident.setDescIncident("Rachwa");
		incident.setDateOfIncident(new Date());

		Assert.assertEquals(true, incidentBusinessRemote.addIncident(incident));

	}
	
	@Test
	public void testDeleteIncident(){
		Incident incident=incidentBusinessRemote.findIncidentById(1);
		Assert.assertEquals(true, incidentBusinessRemote.deleteIncident(incident));
		
	}
	
	@Test
	public void testUpdateIncident(){
		Incident incidentFound=incidentBusinessRemote.findIncidentById(1);
		incidentFound.setDescIncident("9ahwa");
		
		
		Assert.assertTrue(incidentBusinessRemote.updateIncident(incidentFound));
	}

}
