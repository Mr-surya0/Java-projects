package com.conditions;

public class NestedElseIf {

	public static void main(String[] args) {
int a,b;
a=10;
b=12;
if (a<b && a<=b) {
	System.out.println("condition 1");
}
else if(a==b && a<=b) {
	System.out.println("condition 2");
}
else if(a==b && a==b) {
	System.out.println("condition 2");
}
else {
	System.err.println("condition 3");
}
	}

}
