package cim.xin.dao;

import cim.xin.domain.User;

public interface UserDao {
	
	public User selectUserById(Integer userId);

}
