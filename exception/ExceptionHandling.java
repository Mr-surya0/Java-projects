package com.exception;

class vote{
	static void canVote(int age) {
		if (age<18) {
			try {
			throw new Exception();
			}
			catch(Exception obj) {
				System.out.println("you are not an adult");
			}
		}
		else {
			System.out.println("you can vote");
		}
	}
}

public class ExceptionHandling {

	public static void main(String[] args) {
vote.canVote(10);
vote.canVote(20);
	}

}
