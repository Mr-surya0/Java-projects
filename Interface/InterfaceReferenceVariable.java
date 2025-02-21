package com.Interface;
interface murugan{
	void example();
}
class dominor implements murugan{
	public void example() {
		System.out.println("Reference variable executed successfully");
	}
}
public class InterfaceReferenceVariable {

	public static void main(String[] args) {
		// Interface with reference variable
       murugan ref;
       dominor d=new dominor();
       ref =d;
       ref.example();
	}

}
