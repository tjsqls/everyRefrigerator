package semi.everyRefrigerator_templete;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import everyRefrigerator.domain.User;
import everyRefrigerator.service.UserService;
import everyRefrigerator.service.logic.UserServiceLogic;

public class UserServiceLogicTest {
	
	private UserService service;

	@Before
	public void setUp(){
		service = new UserServiceLogic();
	}

	@Test
	public void testRegistUser() {
//	User user = new User();
//	user.setId("seonbin");
//	user.setPassword("1234");
//	user.setName("임선빈");
//	user.setDateOfBirth("19910920");
//	user.setPhoneNumber("01000000000");
//	user.setEmail("sundeeng2748@naver.com");
//
//	service.registUser(user);
//	assertNotNull(user);
	}

	@Test
	public void testFindById() {
		User user = new User();
		user = service.findById("seonbin");
		
		assertNotNull(user);
		assertEquals("임선빈", user.getName());
	}

	@Test
	public void testModifyUser() {
//		User user = service.findById("79");
//		user.setPassword("1111");
//		user.setPhoneNumber("01012340000");
//		
//		service.modifyUser(user);
	}

	@Test
	public void testRemoveUser() {
//		User user = service.findById("79");
//		service.removeUser(user);
	}

}
