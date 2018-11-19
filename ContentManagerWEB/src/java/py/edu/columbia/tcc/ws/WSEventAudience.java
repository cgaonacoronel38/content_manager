/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.columbia.tcc.ws;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import py.edu.columbia.tcc.common.WSRespondeStatus;
import py.edu.columbia.tcc.ejb.jpa.bean.ws.ContentAudienceBean;
import py.edu.columbia.tcc.ejb.jpa.content.AudienceEventFacade;
import py.edu.columbia.tcc.ejb.jpa.content.ContentFacade;
import py.edu.columbia.tcc.ejb.jpa.content.DeviceFacade;
import py.edu.columbia.tcc.ejb.jpa.content.EventFacade;
import py.edu.columbia.tcc.model.bean.AudienceEventBean;
import py.edu.columbia.tcc.model.chartData.AudienceEvent;

/**
 *
 * @author tokio
 */
@Path("/eventaudience")
@ManagedBean
public class WSEventAudience implements Serializable {
    private final Logger log = LoggerFactory.getLogger(WSEventAudience.class);
    
    @Inject
    private AudienceEventFacade audienceEventEJB;
    
    @Inject
    private DeviceFacade deviceEJB;
    
    @Inject
    private ContentFacade contentEJB;
    
    @Inject
    private EventFacade eventEJB;
    
    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response register(AudienceEventBean audienceEventBean) {
        WSRespondeStatus responseStatus = WSRespondeStatus.REGISTER_ERROR;
        try {
            AudienceEvent audienceEvent = new AudienceEvent();
            audienceEvent.setDeviceDate(audienceEventBean.getDeivceDate());
            audienceEvent.setIdDevice(deviceEJB.getDeviceIdByUUID(audienceEventBean.getUuidDevice()));
            audienceEvent.setIdContent(contentEJB.getContentIdByUUID(audienceEventBean.getUuidContent()));
            audienceEvent.setIdEvent(eventEJB.getEventIdByUUID(audienceEventBean.getUuidEvent()));
            audienceEvent.setRegistrationTime(audienceEventBean.getRegistrationDate());
            audienceEvent.setServerDate(new Date());
            
            audienceEventEJB.create(audienceEvent);
            
            System.out.println("Auidence id: "+audienceEvent.getIdAudienceEvent());
            
            responseStatus = WSRespondeStatus.OK;
            return WSUtil.getResponse(200, responseStatus.getStatusCode(), responseStatus.getStatusDescription(), Long.valueOf(audienceEvent.getIdAudienceEvent()));
        } catch (Exception e) {
            log.error("Error al registrar evento de contenido!!: " + e.getMessage());
            log.error("Error al registrar evento de contenido: ",e);
            return WSUtil.getResponse(500, responseStatus.getStatusCode(), responseStatus.getStatusDescription());
        } 
    }
}
