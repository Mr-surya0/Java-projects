package com.oops;
//determine the object in runtime
class palani{
	void p1() {
		System.out.println("hii palani");
	}
}
class jayachandran extends palani{
	void p2(){
		System.out.println("hii chandran");
		
	}
}
public class DynamicBinding {

	public static void main(String[] args) {
      jayachandran obj = new jayachandran();
      obj.p2();
	}

}
