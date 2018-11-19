package py.edu.columbia.tcc.model.contentHandler;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Audiences.class)
public abstract class Audiences_ {

	public static volatile SingularAttribute<Audiences, Date> hourFrom;
	public static volatile SingularAttribute<Audiences, Date> serverDate;
	public static volatile SingularAttribute<Audiences, Date> hourTo;
	public static volatile SingularAttribute<Audiences, AudiencesPK> audiencesPK;
	public static volatile SingularAttribute<Audiences, Integer> stayTime;
	public static volatile SingularAttribute<Audiences, Date> deviceDate;
	public static volatile SingularAttribute<Audiences, Device> device;

}

