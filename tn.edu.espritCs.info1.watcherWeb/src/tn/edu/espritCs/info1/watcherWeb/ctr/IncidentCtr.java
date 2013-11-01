package tn.edu.espritCs.info1.watcherWeb.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessLocal;
import tn.edu.espritCs.info1.watcher.domain.Incident;

@ManagedBean
@SessionScoped
public class IncidentCtr {

	// the model
	private Incident incident = new Incident();
	private List<Incident> incidents = new ArrayList<Incident>();
	// injection of the proxy
	@EJB
	private IncidentBusinessLocal incidentBusinessLocal;

	// the methode
	public String doAddIncident() {
		incidentBusinessLocal.addIncident(incident);
		return "";
	}

	public Incident getIncident() {
		return incident;
	}

	public void setIncident(Incident incident) {
		this.incident = incident;
	}

	public List<Incident> getIncidents() {
		incidents = incidentBusinessLocal.findAllIncidents();
		return incidents;
	}

	public void setIncidents(List<Incident> incidents) {
		this.incidents = incidents;
	}

}
