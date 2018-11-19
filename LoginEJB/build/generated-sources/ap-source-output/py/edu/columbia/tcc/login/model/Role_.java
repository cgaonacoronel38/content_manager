package py.edu.columbia.tcc.login.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Role.class)
public abstract class Role_ {

	public static volatile SingularAttribute<Role, Boolean> sysRole;
	public static volatile ListAttribute<Role, User> userList;
	public static volatile SingularAttribute<Role, Integer> idRole;
	public static volatile SingularAttribute<Role, String> realmgroupname;
	public static volatile SingularAttribute<Role, String> description;
	public static volatile ListAttribute<Role, MenuPermission> menuPermissionList;

}

