package py.edu.columbia.tcc.model.contentHandler;

import java.util.Date;
import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Content.class)
public abstract class Content_ {

	public static volatile SingularAttribute<Content, Integer> duration;
	public static volatile SingularAttribute<Content, Long> idCompany;
	public static volatile ListAttribute<Content, DeviceContent> deviceContentList;
	public static volatile SingularAttribute<Content, Date> dueDate;
	public static volatile SingularAttribute<Content, Integer> idContent;
	public static volatile SingularAttribute<Content, String> name;
	public static volatile SingularAttribute<Content, String> description;
	public static volatile SingularAttribute<Content, Boolean> active;
	public static volatile ListAttribute<Content, Playbacks> playbacksList;
	public static volatile SingularAttribute<Content, String> directory;
	public static volatile SingularAttribute<Content, UUID> uuid;

}

