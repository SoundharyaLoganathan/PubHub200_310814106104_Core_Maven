package com.bookapp.dao;

import com.bookapp.model.User;

public class TestUserDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		user.setUserName("padmap");
		user.setEmail("padmap@gmail.com");
		user.setPassword("p123");
		user.setActive(1);
		
		
		UserDAO dao= new UserDAO();
		dao.register(user);
		
	}

}
