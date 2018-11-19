package py.edu.columbia.tcc.model.chartData;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypeChart.class)
public abstract class TypeChart_ {

	public static volatile SingularAttribute<TypeChart, String> name;
	public static volatile SingularAttribute<TypeChart, String> description;
	public static volatile ListAttribute<TypeChart, ChartPanel> chartPanelList;
	public static volatile SingularAttribute<TypeChart, Integer> idTypeChart;

}

