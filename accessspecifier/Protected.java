package com.accessspecifier;

class Fun {
	protected static String sur = "sure";

	protected void men() {
	}
}

class Sub extends Fun {
	protected void man() {
		System.out.println("Protected is working: " + sur);
	}
}

public class Protected {
	public static void main(String[] args) {
		// Within the class and subclass
		Sub s = new Sub();
		s.man();
	}
}
