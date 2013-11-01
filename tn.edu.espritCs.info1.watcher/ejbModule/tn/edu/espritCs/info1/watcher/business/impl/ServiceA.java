package tn.edu.espritCs.info1.watcher.business.impl;

import javax.ejb.Stateless;
import tn.edu.espritCs.info1.watcher.business.interfaces.ServiceALocal;
import tn.edu.espritCs.info1.watcher.business.interfaces.ServiceARemote;

/**
 * Session Bean implementation class ServiceA
 */
@Stateless
public class ServiceA implements ServiceARemote, ServiceALocal {

    /**
     * Default constructor. 
     */
    public ServiceA() {
        // TODO Auto-generated constructor stub
    }

}
