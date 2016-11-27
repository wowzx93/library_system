package DAO;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.User;
 
public interface UserDao {
	
	/**
	 * 根据用户名查询用户是否存在
	 * @param userName  用户名
	 * @return	
	 */
	int userIsExist(String userName);
	
	/**
	 * 登录验证
	 * @param userName 用户名	
	 * @param userPwd	密码
	 * @return	1：正确，
	 */
	User sign(@Param("userName")String userName,@Param("userPwd")String userPwd);
	
	/**
	 * 删除用户
	 * @param userName
	 * @return	
	 */
	int reduceUser(String userName);
	
	/**
	 * 注册新用户
	 * @param userName
	 * @param userPwd
	 * @return
	 */
	int addUser(@Param("userName")String userName,@Param("userPwd")String userPwd);
	
	/**
	 * 更改用户状态
	 * @param userName 用户名
	 * @param newStatus	新状态
	 * @return
	 */
	int setUserStatus(@Param("userName")String userName,@Param("newStatus")int newStatus);
	
	/**
	 * @return 所有用户
	 */
	List<User> queryAll();
	
	/**
	 * 查询某一状态的所有用户
	 * @param userStatus
	 * @return 某一状态的所有用户。
	 */
	List<User> queryAllByOneStatus(int userStatus); 
	
}
