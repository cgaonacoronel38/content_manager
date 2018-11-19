package py.edu.columbia.tcc.model.contentHandler;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Country.class)
public abstract class Country_ {

	public static volatile ListAttribute<Country, Location> locationList;
	public static volatile SingularAttribute<Country, String> description;
	public static volatile ListAttribute<Country, City> cityList;
	public static volatile SingularAttribute<Country, Integer> idCountry;

}

