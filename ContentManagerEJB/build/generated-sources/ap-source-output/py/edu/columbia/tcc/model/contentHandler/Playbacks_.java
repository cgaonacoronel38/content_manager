package py.edu.columbia.tcc.model.contentHandler;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Playbacks.class)
public abstract class Playbacks_ {

	public static volatile SingularAttribute<Playbacks, Date> hourFrom;
	public static volatile SingularAttribute<Playbacks, Date> serverDate;
	public static volatile SingularAttribute<Playbacks, Date> hourTo;
	public static volatile SingularAttribute<Playbacks, Integer> stayTime;
	public static volatile SingularAttribute<Playbacks, PlaybacksPK> playbacksPK;
	public static volatile SingularAttribute<Playbacks, Date> deviceDate;
	public static volatile SingularAttribute<Playbacks, Device> device;
	public static volatile SingularAttribute<Playbacks, Content> content;

}

