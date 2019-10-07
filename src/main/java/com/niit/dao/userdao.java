package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface userdao {
public List<User> getUserList();
	
	public boolean createUser(User user);
	
	public User getUserById(String userId);
	
	public boolean updateUser(User user);
	
	public boolean deleteUser(int userId);
	
	public List<User> getUserListByName(String username);
	
	public User authUser(String userId,String password);

		
	
}
