package com.part1.Oops;

class Account {
   public String name;
   protected String email;
   private String password;
 
   public void setPassword(String password) {
       this.password = password;
   }
   
   public void getDetails() {
	   System.out.println(name);
	   System.out.println(email);
	   System.out.println(password);
   }
}
public class Sample {
   public static void main(String args[]) {
       Account a1 = new Account();
       a1.name = "Apna College";
       a1.setPassword("abcd");
       a1.email = "hello@apnacollege.com";
       
       a1.getDetails();
   }
}

