/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.columbia.tcc.ejb.jpa.content;

import py.edu.columbia.tcc.exception.GDMEJBException;
import java.util.UUID;
import javax.ejb.Stateless;
import javax.persistence.Query;
import py.edu.columbia.tcc.model.contentHandler.Event;

@Stateless
public class EventFacade extends AbstractFacade<Event> {
    
    public EventFacade(){
        super(Event.class);
    }
    
    public Event getEventIdByUUID(UUID uuid) throws GDMEJBException {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT d ");
            sb.append("  FROM Event d ");
            sb.append(" WHERE d.uuid = ?1");
            
            Query q = getEntityManager().createQuery(sb.toString());
            q.setParameter(1, uuid);
            
            return (Event)q.getSingleResult();
        } catch (Exception ex) {
            System.err.println("Error al obtener uuid de evento: "+ex.getMessage());
            System.err.println(ex);
            throw new GDMEJBException("Error al obtener identificador de evento", ex);
        } 
    }
}