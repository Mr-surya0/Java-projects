package com.Test3;

public class T2 {

	public static void main(String[] args) {
		// no of odd number in an array
		int num []= {2,3,4,5,6,7};
		int i=0;
		int g=0;
		while (i<num.length) {
			if (num[i]%2!=0) {
				System.out.println(num[i]);
			}
			i++;
		}
	}

}
