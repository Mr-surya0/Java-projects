package com.Test2;


public class T4 {

	 public static void main(String[] args) {
	        int[] num = {1, 2, 3, 4, 5, 6};
	        
	        int sum=0;
	        
	        int i=0;
	     
	        while(i < num.length) {
	        	sum += num[i];
	        	i++;
	        }
	        int average = sum/num.length;
	        System.out.println("the average value is "+average);
	    }
	}