package semi.everyRefrigerator_templete;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import everyRefrigerator.domain.User;
import everyRefrigerator.store.UserStore;
import everyRefrigerator.store.logic.UserStoreLogic;

public class UserStoreLogicTest {
	
	private UserStore store;

	@Before
	public void setUp(){
		store = new UserStoreLogic();
	}

	@Test
	public void testCreateUser() {
//		User user = new User();
//		user.setId("inae");
//		user.setPassword("1234");
//		user.setName("정인애");
//		user.setDateOfBirth("19910618");
//		user.setPhoneNumber("01000000000");
//		user.setEmail("esther0618@naver.com");
//
//		store.createUser(user);
//		assertNotNull(user);
	}

	@Test
	public void testReadById() {
		User user = new User();
		user = store.readById("inae");
		
		assertNotNull(user);
		assertEquals("정인애", user.getName());
	}

	@Test
	public void testUpdateUser() {
//	User user = store.readById("inae");
//	user.setPassword("1111");
//	user.setPhoneNumber("01012340000");
//	
//	store.updateUser(user);
	}

	@Test
	public void testDeleteUser() {
//		User user = store.readById("inae0000");
//		store.deleteUser(user);
	}
}
