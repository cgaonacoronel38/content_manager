package py.edu.columbia.tcc.model.chartData;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.edu.columbia.tcc.model.contentHandler.Device;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AudienceDevice.class)
public abstract class AudienceDevice_ {

	public static volatile SingularAttribute<AudienceDevice, Date> registrationTime;
	public static volatile SingularAttribute<AudienceDevice, Date> serverDate;
	public static volatile SingularAttribute<AudienceDevice, Short> stayTime;
	public static volatile SingularAttribute<AudienceDevice, Device> idDevice;
	public static volatile SingularAttribute<AudienceDevice, Date> deviceDate;
	public static volatile SingularAttribute<AudienceDevice, Long> idAudienceDevice;

}

