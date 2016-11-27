package DAO;

import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class UserDaoTest {
	@Resource
	private UserDao userdao;

	@Test
	public void testUserIsExist() {
		String name = "admin1";
		String name2 = "admin";
		int result = userdao.userIsExist(name);
		int result2 = userdao.userIsExist(name2);
		if (result == 1) {
			System.out.println("该用户:" + name + "已存在");
		} else {
			System.out.println("该用户:" + name + "不存在");
		}
		if (result2 == 1) {
			System.out.println("该用户:" + name2 + "已存在");
		} else {
			System.out.println("该用户:" + name2 + "不存在");
		}
	}

	@Test
	public void testReduceUser() {
		String name = "superman";
		if(userdao.reduceUser(name)==1)
			System.out.println("OK");
	}

	@Test
	public void testSign() {
		String name = "admin1";
		String pwd = "666666";
		User user = userdao.sign(name, pwd);
		System.out.println(user);
	}

	@Test
	public void testAddUser() {
		String name = "superman";
		String pwd = "19931022";
		if(userdao.addUser(name, pwd)==1)
			System.out.println("OK");
	}

	@Test
	public void testSetUserStatus() {
		String name = "admin1";
		userdao.setUserStatus(name, 0);
	}

	@Test
	public void testQueryAll() {
		List<User> users = userdao.queryAll();
		System.out.println(users);
	}

	@Test
	public void testQueryAllByOneStatus() {
		System.out.println(userdao.queryAllByOneStatus(1));
	}

}
