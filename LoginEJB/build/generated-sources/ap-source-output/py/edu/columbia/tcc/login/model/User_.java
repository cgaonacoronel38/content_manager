package py.edu.columbia.tcc.login.model;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, Integer> idUser;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, Company> idCompany;
	public static volatile SingularAttribute<User, Date> dateAdd;
	public static volatile SingularAttribute<User, Role> idRole;
	public static volatile SingularAttribute<User, Date> lastSignIn;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, Boolean> active;
	public static volatile SingularAttribute<User, String> userName;
	public static volatile SingularAttribute<User, BigInteger> userAdd;

}

