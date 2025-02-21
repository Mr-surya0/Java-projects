package com.Interface;
interface father {
	float ht=6;
	void height();
	
}
interface mother{
	float ht=5;
	void height();
}
class child implements father,mother{
public	void height () {
	float height =(father.ht+mother.ht)/2;
	System.out.println("child height is: "+height);
}
}
public class MultipleInterface {

	public static void main(String[] args) {
		// Multiple interface implemented into single class
		child obj=new child();
		obj.height();

	}

}
