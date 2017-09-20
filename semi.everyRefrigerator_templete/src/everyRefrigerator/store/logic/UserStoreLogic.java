package everyRefrigerator.store.logic;



import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import everyRefrigerator.domain.User;
import everyRefrigerator.store.UserStore;
import everyRefrigerator.store.factory.SqlSessionFactoryProvider;
import everyRefrigerator.store.mapper.UserMapper;

public class UserStoreLogic implements UserStore {

	private SqlSessionFactory factory;

	public UserStoreLogic() {
		factory = SqlSessionFactoryProvider.getSqlSessionFactory();
	}

	@Override
	public void createUser(User user) {
		SqlSession session = factory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.createUser(user);
			session.commit();
		} finally {
			session.close();
		}
	}

	@Override
	public User readById(String id) {
		SqlSession session = factory.openSession();
		User user = null;
		try {
			user = new User();
			UserMapper mapper = session.getMapper(UserMapper.class);
			user = mapper.readById(id);
			session.commit();			
		} finally {
			session.close();
		}
		return user;
	}

	@Override
	public void updateUser(User user) {
		SqlSession session = factory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.updateUser(user);
			session.commit();
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteUser(User user) {

		SqlSession session = factory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			mapper.deleteUser(user);
			session.commit();
		} finally {
			session.close();
		}
	}
}
