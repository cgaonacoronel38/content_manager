package py.edu.columbia.tcc.login.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Company.class)
public abstract class Company_ {

	public static volatile SingularAttribute<Company, String> ruc;
	public static volatile SingularAttribute<Company, String> address;
	public static volatile ListAttribute<Company, User> userList;
	public static volatile SingularAttribute<Company, Integer> idCompany;
	public static volatile SingularAttribute<Company, String> phone;
	public static volatile SingularAttribute<Company, String> name;
	public static volatile SingularAttribute<Company, Boolean> active;
	public static volatile SingularAttribute<Company, String> email;

}

