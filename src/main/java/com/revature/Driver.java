package com.revature;

import com.revature.model.User;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		User user = new User(1, "Parker", "Schultz", "pook", "password", "employee");
		int[] myNum = {5, 5, 5, 5};
		System.out.println(user.getFirstName());
		
		int total = user.Sum(myNum);
		
		boolean testPower = user.power(300);
		System.out.println(testPower);
		
		System.out.println(total);
	}
	
	
	

}
