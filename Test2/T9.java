package com.Test2;

public class T9 {
//average of five no using while loop
	public static void main(String[] args) {
  int a [] = {1,2,3,4,5};
  int sum=0;
  int i = 0;
  while (i<a.length) {
	  sum += a[i];
	  i++;
  }
  System.out.println("sum of five no "+sum);
	}

}
