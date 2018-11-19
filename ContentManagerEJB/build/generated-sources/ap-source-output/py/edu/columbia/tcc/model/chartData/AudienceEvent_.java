package py.edu.columbia.tcc.model.chartData;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.edu.columbia.tcc.model.contentHandler.Content;
import py.edu.columbia.tcc.model.contentHandler.Device;
import py.edu.columbia.tcc.model.contentHandler.Event;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AudienceEvent.class)
public abstract class AudienceEvent_ {

	public static volatile SingularAttribute<AudienceEvent, Date> registrationTime;
	public static volatile SingularAttribute<AudienceEvent, Date> serverDate;
	public static volatile SingularAttribute<AudienceEvent, Content> idContent;
	public static volatile SingularAttribute<AudienceEvent, Integer> idAudienceEvent;
	public static volatile SingularAttribute<AudienceEvent, Event> idEvent;
	public static volatile SingularAttribute<AudienceEvent, Device> idDevice;
	public static volatile SingularAttribute<AudienceEvent, Date> deviceDate;

}

