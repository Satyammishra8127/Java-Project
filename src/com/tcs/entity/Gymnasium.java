package com.tcs.entity;

import java.util.ArrayList;
import java.util.List;

public class Gymnasium {
     
	static List<User>users=new ArrayList<>();
	public static void main(String[] args) {
	   for(int i=0;i<10;i++) {
		   User u1= new User();
		    u1.setName("Ram" + i);
	        u1.setAge((byte)(10*i));
	        users.add(u1);
	   }
       System.out.println(users);
       users.get(0).workout();
	}

}
