package com.operators30;

import java.util.Scanner;

public class o7 {

	public static void main(String[] args) {
		// count the number of set bits in an integer

	    {
	        int n, m, count = 0;
	        String x = "";
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the any Number:");
	        n = s.nextInt();
	        while(n > 0)
	        {
	            int a = n % 2;
	            x = a + x;
	            n = n / 2;
	            System.out.println(n);
	        }
	        int l = x.length();
	        for(int i = 0; i < l; i++)
	        {
	            if(x.charAt(i) == '1')
	            {
	                count++;

	            }
	        }

	        System.out.println("No. of 1's are:"+count);

	    }

	}}