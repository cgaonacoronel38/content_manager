package py.edu.columbia.tcc.model.contentHandler;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(City.class)
public abstract class City_ {

	public static volatile ListAttribute<City, Location> locationList;
	public static volatile SingularAttribute<City, Integer> idCity;
	public static volatile SingularAttribute<City, String> description;
	public static volatile SingularAttribute<City, Country> idCountry;

}

