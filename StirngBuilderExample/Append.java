package com.StirngBuilderExample;

public class Append {

	public static void main(String[] args) {
     StringBuilder obj=new StringBuilder("Hello");
     obj.append(" world");
     System.out.println(obj);
     
     StringBuilder obj1=new StringBuilder("hii");
     obj1.append(true);
     System.out.println(obj1);
     
     String str1="Hello";
     String str2="welcome";
     String str3=str1+str2;
     System.out.println(str3);
     System.out.println("join 2 string:"+str3);
	}

}
