package py.edu.columbia.tcc.model.chartData;

import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ChartPanel.class)
public abstract class ChartPanel_ {

	public static volatile SingularAttribute<ChartPanel, Long> idUser;
	public static volatile SingularAttribute<ChartPanel, Integer> columnOrder;
	public static volatile SingularAttribute<ChartPanel, Integer> idChartPanel;
	public static volatile SingularAttribute<ChartPanel, String> title;
	public static volatile SingularAttribute<ChartPanel, Integer> rowOrder;
	public static volatile SingularAttribute<ChartPanel, UUID> uuid;
	public static volatile SingularAttribute<ChartPanel, TypeChart> idTypeChart;
	public static volatile SingularAttribute<ChartPanel, FilterSetting> idFilterSetting;

}

