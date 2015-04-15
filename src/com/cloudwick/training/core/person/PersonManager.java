package com.cloudwick.training.core.person;

import com.cloudwick.training.core.user.UserManager;
import com.cloudwick.training.core.user.AdminUser;

public class PersonManager {
	public static void main(String[] args) {
		// UserManager userObj = new UserManager();

		AdminUser userObj = new AdminUser();
		System.out.println(userObj);
		System.out.println(userObj.getSsn());
		System.out.println("Substraction " + userObj.calculate(20, 10, "sub"));
		userObj.printResult();

		userObj.firstName = "Alekya";
		userObj.setName("Alekya");
		int sum = userObj.calculate(1, 2);
		System.out.println(sum);
		System.out.println(userObj.firstName);
		// userObj.state="CA";
		System.out.println(UserManager.state);
		userObj.setSsn(1234);
		System.out.println(userObj.toString());

		int i = 24;
		int j = 35;
		if (i == j)
			System.out.println("equal");
		else
			System.out.println("Not equal");

		UserManager userObj2 = userObj;
		// UserManager userobj2 = new UserManager();
		if (userObj == userObj2)
			System.out.println("equal");
		else
			System.out.println("Not equals");

		String s = "fremont";
		String s2 = "Fremont";
		if (s.equals(s2)) {
			System.out.println("equal");
		} else {
			System.out.println("Not equal");
		}

		String f = "f";
		String f2 = "f";
		System.out.println(f == (f2));

		String f3 = new String("f");
		String f4 = new String("f");
		System.out.println(f3 == (f4));
	}
}
