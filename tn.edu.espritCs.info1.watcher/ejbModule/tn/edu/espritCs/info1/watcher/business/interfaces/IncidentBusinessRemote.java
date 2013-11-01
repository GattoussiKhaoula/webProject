package tn.edu.espritCs.info1.watcher.business.interfaces;

import javax.ejb.Remote;

import tn.edu.espritCs.info1.watcher.domain.Incident;

@Remote
public interface IncidentBusinessRemote {
	public void doAutograph();

	public boolean addIncident(Incident incident);

	public Incident findIncidentById(int idIncident);

	public boolean deleteIncident(Incident incident);

	public boolean updateIncident(Incident incidentFound);
}

