package com.codegnan.dao;

import java.util.List;

import com.codegnan.entity.User;

public interface UserDao {
	public void addUser(User user);
	
	public User getUserById(int id);
	
	public List<User> getAllUsers();	
	
	public void updateUser(User user);
	
	public void deleteUser(int id);
	
}
