package py.edu.columbia.tcc.model.chartData;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FilterSetting.class)
public abstract class FilterSetting_ {

	public static volatile SingularAttribute<FilterSetting, Date> fromDate;
	public static volatile SingularAttribute<FilterSetting, Boolean> allContents;
	public static volatile SingularAttribute<FilterSetting, Date> toDate;
	public static volatile SingularAttribute<FilterSetting, TypeFilter> idTypeFilter;
	public static volatile SingularAttribute<FilterSetting, TypeTime> idTypeTime;
	public static volatile ListAttribute<FilterSetting, ChartPanel> chartPanelList;
	public static volatile SingularAttribute<FilterSetting, Boolean> allPlaces;
	public static volatile SingularAttribute<FilterSetting, Boolean> allDevices;
	public static volatile SingularAttribute<FilterSetting, Integer> idFilterSetting;
	public static volatile SingularAttribute<FilterSetting, TypePlace> idTypePlace;

}

