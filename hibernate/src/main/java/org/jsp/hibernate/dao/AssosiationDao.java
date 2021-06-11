package org.jsp.hibernate.dao;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	import com.oehm5.hibernate.entity.Team;

	public class AssosiationDao {

		public void saveTeamDetails(Team team) {
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(team);
			transaction.commit();
		}
	}


