package com.array;

public class ArrayEvenNo {

	public static void main(String[] args) {
		// print the even no of given array
int a[]= {2,3,4,1,4,5};
System.out.println("The even numbers are");
for (int i=0;i<a.length;i++) {
	     if(a[i]%2==0) {
	    	 System.out.println(a[i]);
	     }
}
	}

}
