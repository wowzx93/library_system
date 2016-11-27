package DAO;

import java.util.List;

import entity.Manager;

public interface ManagerDao {
	
	/**
	 * 根据管理员名查询管理员
	 * @param managerName
	 * @return
	 */
	Manager queryByName(String managerName);
	
	/**
	 * 添加管理员，系统无法添加超级管理员
	 * @param managerName
	 * @param managerPwd
	 * @param managerPower 管理员权限
	 * @return
	 */
	int addManager(String managerName,String managerPwd);
	
	/**
	 * 删除管理员
	 * @param managerName
	 * @return
	 */
	int reduceManager(String managerName);
	
	/**
	 * 查询所有的管理员账号
	 * @return
	 */
	List<Manager> queryAll();
	
}
