package com.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class c2Main {

	public static void main(String[] args) {
        Set<c1> c=new HashSet<c1>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter student id");
        int in =scan.nextInt();
        System.out.println("Enter your name");
        String sn =scan.next();
        System.out.println("Enter your age");
        int age=scan.nextInt();
        c1 obj=new c1( in, sn, age);
        
        System.out.println(obj);
	}

}
