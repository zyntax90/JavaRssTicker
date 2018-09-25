package common;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory _sessionFactory;
	private static StandardServiceRegistry standardServiceRegistryBuilder;

	public static SessionFactory getSessionFactory(String configurationPath, String mappingPath) {
		if (_sessionFactory == null) {

			Configuration configuration = new Configuration();
			configuration.configure(new File(configurationPath));
			configuration.addResource(mappingPath);
			standardServiceRegistryBuilder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			_sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder);
		}
		return _sessionFactory;
	}

	public static void destroyRegistryBuilder() {
		StandardServiceRegistryBuilder.destroy(standardServiceRegistryBuilder);
	}

}
