package com.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class c4 {

	public static void main(String[] args) {
       Set<c3> s=new HashSet<c3>();
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the no of student:");
       int n=scan.nextInt();
       for (int i=0;i<n;i++) {
    	   System.out.println("Enter student id:");
    	   int id=scan.nextInt();
    	   System.out.println("Enter student name");
    	   String stdname=scan.next();
    	   System.out.println("Enter student age");
    	   int ag=scan.nextInt();
    	   c3 obj=new c3(id,stdname,ag);
           System.out.println(obj);
       }
      
	}

}
