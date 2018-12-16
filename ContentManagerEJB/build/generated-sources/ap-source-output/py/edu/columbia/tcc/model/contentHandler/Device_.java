package py.edu.columbia.tcc.model.contentHandler;

import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Device.class)
public abstract class Device_ {

	public static volatile SingularAttribute<Device, Long> idCompany;
	public static volatile SingularAttribute<Device, Location> idLocation;
	public static volatile ListAttribute<Device, DeviceContent> deviceContentList;
	public static volatile SingularAttribute<Device, String> name;
	public static volatile SingularAttribute<Device, String> description;
	public static volatile SingularAttribute<Device, Boolean> active;
	public static volatile ListAttribute<Device, Playbacks> playbacksList;
	public static volatile SingularAttribute<Device, Integer> idDevice;
	public static volatile SingularAttribute<Device, UUID> uuid;

}

