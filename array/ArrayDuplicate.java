package com.array;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// which one is duplicate 
		int a[]= {2,3,4,5,5,6};
        for (int i=0;i<a.length;i++) {
        	for (int j=i+1;j<a.length;j++) {
        		if(a[i]==a[j]) {
        			System.out.println(a[j]);
        			}
        	}
        }
	}

}
