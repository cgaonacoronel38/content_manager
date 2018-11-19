package py.edu.columbia.tcc.model.chartData;

import java.util.Date;
import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DevicePing.class)
public abstract class DevicePing_ {

	public static volatile SingularAttribute<DevicePing, Date> serverDate;
	public static volatile SingularAttribute<DevicePing, UUID> currentContent;
	public static volatile SingularAttribute<DevicePing, Integer> currentAudienceQuantity;
	public static volatile SingularAttribute<DevicePing, Date> deviceDate;
	public static volatile SingularAttribute<DevicePing, UUID> device;

}

