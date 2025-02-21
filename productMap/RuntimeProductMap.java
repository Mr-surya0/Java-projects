package com.productMap;

import java.util.HashMap;
import java.util.Scanner;

class student{
	String stdName;
	int stdId;
	public student(String stdName, int stdId) {
		super();
		this.stdName = stdName;
		this.stdId = stdId;
	}
	@Override
	public String toString() {
		return "student [stdName=" + stdName + ", stdId=" + stdId + "]";
	}
}
public class RuntimeProductMap {

	public static void main(String[] args) {
HashMap<Integer,student> obj=new HashMap<Integer,student>();
Scanner scan = new Scanner(System.in);

System.out.println("Enter student id");
int a=scan.nextInt();

System.out.println("Enter the stuedent name");
String b=scan.next();
student s =new student(b,a);

obj.put(7, s);
System.out.println(obj);


	}

}
