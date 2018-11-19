package py.edu.columbia.tcc.model.contentHandler;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Location.class)
public abstract class Location_ {

	public static volatile SingularAttribute<Location, Integer> idLocation;
	public static volatile SingularAttribute<Location, String> latitude;
	public static volatile SingularAttribute<Location, String> name;
	public static volatile SingularAttribute<Location, City> idCity;
	public static volatile ListAttribute<Location, Device> deviceList;
	public static volatile SingularAttribute<Location, String> description;
	public static volatile SingularAttribute<Location, Country> idCountry;
	public static volatile SingularAttribute<Location, String> longitude;

}

