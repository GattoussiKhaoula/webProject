package tn.edu.espritCs.info1.watcher.business.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessLocal;
import tn.edu.espritCs.info1.watcher.business.interfaces.IncidentBusinessRemote;
import tn.edu.espritCs.info1.watcher.domain.Incident;

/**
 * Session Bean implementation class IncidentBusiness
 */
@Stateless
public class IncidentBusiness implements IncidentBusinessRemote,
		IncidentBusinessLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public IncidentBusiness() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doAutograph() {
		System.out.println("ya hala chou lounak ...");

	}

	@Override
	public boolean addIncident(Incident incident) {
		boolean b = false;
		try {
			entityManager.persist(incident);
			b = true;

		} catch (Exception e) {
			System.err.println("insert problem");
		}
		return b;
	}

	@Override
	public Incident findIncidentById(int idIncident) {

		return entityManager.find(Incident.class, idIncident);
	}

	@Override
	public boolean deleteIncident(Incident incident) {

		boolean b = false;
		try {
			entityManager.remove(entityManager.merge(incident));
			b = true;

		} catch (Exception e) {
			System.err.println("delete problem");
		}
		return b;
	}

	@Override
	public boolean updateIncident(Incident incidentFound) {
		return false;
	}

	@Override
	public List<Incident> findAllIncidents() {

		return entityManager.createQuery("select i from Incident i")
				.getResultList();
	}

}
