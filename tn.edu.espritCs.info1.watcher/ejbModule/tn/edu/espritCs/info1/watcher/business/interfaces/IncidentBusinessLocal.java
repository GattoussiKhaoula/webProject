package tn.edu.espritCs.info1.watcher.business.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.edu.espritCs.info1.watcher.domain.Incident;

@Local
public interface IncidentBusinessLocal {
	public void doAutograph();

	public boolean addIncident(Incident incident);

	public Incident findIncidentById(int idIncident);

	public boolean deleteIncident(Incident incident);

	public boolean updateIncident(Incident incidentFound);

	public List<Incident> findAllIncidents();

}
