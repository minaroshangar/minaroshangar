package com.syntax.class18;

public class Account {
public double accountBalance;
private String userName;
private String password;

void transferFunds(String userName, String password, double accountBalance) {
	if(userName.equals("User1")&& password.equals("pass123")){
		
	}
	
}
public static void main(String[] args) {
	
	Account obj=new Account();
	obj.accountBalance=1467572;
	obj.transferFunds("user1", "pass123", 15776);
}
}
