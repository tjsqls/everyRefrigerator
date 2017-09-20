package everyRefrigerator.store.mapper;

import everyRefrigerator.domain.User;

public interface UserMapper {

	public void createUser(User user);
	public User readById(String id);
	public void updateUser(User user);
	public void deleteUser(User user);

	
}
