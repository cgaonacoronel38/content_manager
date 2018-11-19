/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.columbia.tcc.model.chartData;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import py.edu.columbia.tcc.model.contentHandler.Content;
import py.edu.columbia.tcc.model.contentHandler.Device;
import py.edu.columbia.tcc.model.contentHandler.Event;

/**
 *
 * @author tokio
 */
@Entity
@Table(name = "audience_event", catalog = "content_manager", schema = "chart_data")
public class AudienceEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_audience_event")
    private Integer idAudienceEvent;
    @JoinColumn(name = "id_content", referencedColumnName = "id_content")
    @ManyToOne
    private Content idContent;
    @JoinColumn(name = "id_device", referencedColumnName = "id_device")
    @ManyToOne
    private Device idDevice;
    @JoinColumn(name = "id_event", referencedColumnName = "id_event")
    @ManyToOne
    private Event idEvent;
    @Column(name = "server_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date serverDate;
    @Column(name = "device_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deviceDate;
    @Column(name = "registration_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registrationTime;

    public AudienceEvent() {
    }

    public AudienceEvent(Integer idAudienceEvent) {
        this.idAudienceEvent = idAudienceEvent;
    }

    public AudienceEvent(Integer idAudienceEvent, Device idDevice, Content idContent, Event idEvent, Date serverDate) {
        this.idAudienceEvent = idAudienceEvent;
        this.idDevice = idDevice;
        this.idContent = idContent;
        this.idEvent = idEvent;
        this.serverDate = serverDate;
    }

    public Integer getIdAudienceEvent() {
        return idAudienceEvent;
    }

    public void setIdAudienceEvent(Integer idAudienceEvent) {
        this.idAudienceEvent = idAudienceEvent;
    }

    public Content getIdContent() {
        return idContent;
    }

    public void setIdContent(Content idContent) {
        this.idContent = idContent;
    }

    public Device getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(Device idDevice) {
        this.idDevice = idDevice;
    }

    public Event getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Event idEvent) {
        this.idEvent = idEvent;
    }

    public Date getServerDate() {
        return serverDate;
    }

    public void setServerDate(Date serverDate) {
        this.serverDate = serverDate;
    }

    public Date getDeviceDate() {
        return deviceDate;
    }

    public void setDeviceDate(Date deviceDate) {
        this.deviceDate = deviceDate;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAudienceEvent != null ? idAudienceEvent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AudienceEvent)) {
            return false;
        }
        AudienceEvent other = (AudienceEvent) object;
        if ((this.idAudienceEvent == null && other.idAudienceEvent != null) || (this.idAudienceEvent != null && !this.idAudienceEvent.equals(other.idAudienceEvent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "py.edu.columbia.tcc.model.chartData.AudienceEvent[ idAudienceEvent=" + idAudienceEvent + " ]";
    }
    
}
