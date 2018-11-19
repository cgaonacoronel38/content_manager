package py.edu.columbia.tcc.model.chartData;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.edu.columbia.tcc.model.contentHandler.Content;
import py.edu.columbia.tcc.model.contentHandler.Device;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AudienceContent.class)
public abstract class AudienceContent_ {

	public static volatile SingularAttribute<AudienceContent, Date> registrationTime;
	public static volatile SingularAttribute<AudienceContent, Integer> idAudienceContent;
	public static volatile SingularAttribute<AudienceContent, Date> serverDate;
	public static volatile SingularAttribute<AudienceContent, Integer> stayTime;
	public static volatile SingularAttribute<AudienceContent, Content> idContent;
	public static volatile SingularAttribute<AudienceContent, Date> fromTime;
	public static volatile SingularAttribute<AudienceContent, Device> idDevice;
	public static volatile SingularAttribute<AudienceContent, Date> deviceDate;
	public static volatile SingularAttribute<AudienceContent, Date> toTime;
	public static volatile SingularAttribute<AudienceContent, Integer> audienceQuantity;

}

