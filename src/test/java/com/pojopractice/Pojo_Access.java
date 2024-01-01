package com.pojopractice;

public class Pojo_Access {
	public static void main(String[] args) {
	Pojo_Practice pp = new Pojo_Practice();
	
	System.out.println("BeforeUse:" + pp.getUsername());
	System.out.println(pp.getPassword());
	System.out.println(pp.getLogin());
	
	pp.setUsername("James");
	pp.setPassword("Huggins");
	pp.setLogin("Click");
  System.out.println("AfteUse:" + pp.getUsername());
  System.out.println(pp.getPassword());
  System.out.println(pp.getLogin());


}

}
