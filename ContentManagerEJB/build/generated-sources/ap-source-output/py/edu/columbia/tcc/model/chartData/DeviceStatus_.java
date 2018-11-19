package py.edu.columbia.tcc.model.chartData;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.edu.columbia.tcc.model.contentHandler.Device;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DeviceStatus.class)
public abstract class DeviceStatus_ {

	public static volatile SingularAttribute<DeviceStatus, Date> serverHour;
	public static volatile SingularAttribute<DeviceStatus, Device> idDevice;
	public static volatile SingularAttribute<DeviceStatus, Date> devicentHour;
	public static volatile SingularAttribute<DeviceStatus, Short> audienceQuantity;

}

