package everyRefrigerator.service;

import everyRefrigerator.domain.User;

public interface UserService {

	public void registUser(User user);
	
	public User findById(String id);
	
	public void modifyUser(User user);
	
	public void removeUser(User user);
}
