package py.edu.columbia.tcc.model.chartData;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypeFilter.class)
public abstract class TypeFilter_ {

	public static volatile SingularAttribute<TypeFilter, String> description;
	public static volatile SingularAttribute<TypeFilter, Integer> idFilter;
	public static volatile ListAttribute<TypeFilter, FilterSetting> filterSettingList;

}

