package py.edu.columbia.tcc.login.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MenuPermission.class)
public abstract class MenuPermission_ {

	public static volatile SingularAttribute<MenuPermission, Boolean> access;
	public static volatile SingularAttribute<MenuPermission, Role> role;
	public static volatile SingularAttribute<MenuPermission, MenuPermissionPK> menuPermissionPK;
	public static volatile SingularAttribute<MenuPermission, Boolean> report;
	public static volatile SingularAttribute<MenuPermission, Boolean> insert;
	public static volatile SingularAttribute<MenuPermission, Boolean> update;
	public static volatile SingularAttribute<MenuPermission, Menu> menu;

}

