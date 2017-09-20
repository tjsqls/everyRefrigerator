package everyRefrigerator.service.logic;

import everyRefrigerator.domain.User;
import everyRefrigerator.service.UserService;
import everyRefrigerator.store.UserStore;
import everyRefrigerator.store.logic.UserStoreLogic;

public class UserServiceLogic implements UserService{
	
	private UserStore store;

	public UserServiceLogic() {
		store = new UserStoreLogic();
	}
	
	@Override
	public void registUser(User user) {
		store.createUser(user);
	}

	@Override
	public User findById(String id) {
		User user = store.readById(id);
		return user;
	}

	@Override
	public void modifyUser(User user) {
		store.updateUser(user);
	}

	@Override
	public void removeUser(User user) {
	store.deleteUser(user);	
	}

}
