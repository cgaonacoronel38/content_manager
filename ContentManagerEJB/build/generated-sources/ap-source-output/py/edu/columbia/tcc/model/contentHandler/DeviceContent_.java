package py.edu.columbia.tcc.model.contentHandler;

import java.util.Date;
import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DeviceContent.class)
public abstract class DeviceContent_ {

	public static volatile SingularAttribute<DeviceContent, Date> dateDue;
	public static volatile SingularAttribute<DeviceContent, UUID> uuidContent;
	public static volatile SingularAttribute<DeviceContent, UUID> uuidDevice;
	public static volatile SingularAttribute<DeviceContent, Date> dateAdd;
	public static volatile SingularAttribute<DeviceContent, Boolean> active;
	public static volatile SingularAttribute<DeviceContent, Boolean> downloaded;
	public static volatile SingularAttribute<DeviceContent, Device> device;
	public static volatile SingularAttribute<DeviceContent, DeviceContentPK> deviceContentPK;
	public static volatile SingularAttribute<DeviceContent, Date> dateDownload;
	public static volatile SingularAttribute<DeviceContent, Content> content;
	public static volatile SingularAttribute<DeviceContent, Date> dateInactive;

}

