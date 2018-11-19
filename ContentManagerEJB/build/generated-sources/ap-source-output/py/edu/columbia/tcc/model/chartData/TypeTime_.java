package py.edu.columbia.tcc.model.chartData;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypeTime.class)
public abstract class TypeTime_ {

	public static volatile SingularAttribute<TypeTime, Integer> idTypeTime;
	public static volatile SingularAttribute<TypeTime, Date> dateTo;
	public static volatile SingularAttribute<TypeTime, String> description;
	public static volatile SingularAttribute<TypeTime, Integer> days;
	public static volatile SingularAttribute<TypeTime, Boolean> active;
	public static volatile ListAttribute<TypeTime, FilterSetting> filterSettingList;
	public static volatile SingularAttribute<TypeTime, Date> dateFrom;

}

