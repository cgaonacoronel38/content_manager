package py.edu.columbia.tcc.login.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Menu.class)
public abstract class Menu_ {

	public static volatile SingularAttribute<Menu, Integer> idMenu;
	public static volatile SingularAttribute<Menu, String> name;
	public static volatile SingularAttribute<Menu, String> description;
	public static volatile SingularAttribute<Menu, Boolean> active;
	public static volatile SingularAttribute<Menu, Boolean> sysMenu;
	public static volatile ListAttribute<Menu, MenuPermission> menuPermissionList;
	public static volatile SingularAttribute<Menu, String> url;

}

