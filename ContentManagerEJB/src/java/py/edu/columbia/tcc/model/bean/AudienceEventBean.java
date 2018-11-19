/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.columbia.tcc.model.bean;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author tokio
 */
public class AudienceEventBean {
    private UUID uuidDevice;
    private UUID uuidContent;
    private UUID uuidEvent;
    private Date deivceDate;
    private Date registrationDate;

    public AudienceEventBean() {
    }

    public UUID getUuidDevice() {
        return uuidDevice;
    }

    public void setUuidDevice(UUID uuidDevice) {
        this.uuidDevice = uuidDevice;
    }

    public UUID getUuidContent() {
        return uuidContent;
    }

    public void setUuidContent(UUID uuidContent) {
        this.uuidContent = uuidContent;
    }

    public UUID getUuidEvent() {
        return uuidEvent;
    }

    public void setUuidEvent(UUID uuidEvent) {
        this.uuidEvent = uuidEvent;
    }

    public Date getDeivceDate() {
        return deivceDate;
    }

    public void setDeivceDate(Date deivceDate) {
        this.deivceDate = deivceDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
