package py.edu.columbia.tcc.model.chartData;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import py.edu.columbia.tcc.model.contentHandler.City;
import py.edu.columbia.tcc.model.contentHandler.Location;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FilteredPlace.class)
public abstract class FilteredPlace_ {

	public static volatile SingularAttribute<FilteredPlace, Location> idLocation;
	public static volatile SingularAttribute<FilteredPlace, City> idCity;
	public static volatile SingularAttribute<FilteredPlace, Integer> idFilteredPlace;
	public static volatile SingularAttribute<FilteredPlace, FilterSetting> idFilterSetting;

}

