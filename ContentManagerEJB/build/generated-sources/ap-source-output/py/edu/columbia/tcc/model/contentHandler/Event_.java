package py.edu.columbia.tcc.model.contentHandler;

import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Event.class)
public abstract class Event_ {

	public static volatile SingularAttribute<Event, Integer> idEvent;
	public static volatile SingularAttribute<Event, String> description;
	public static volatile SingularAttribute<Event, UUID> uuid;

}

