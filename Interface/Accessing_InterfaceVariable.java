package com.Interface;
interface variable{
	int muthu=1;
	String murugan="infinite";
	void variables();
	}
class vari implements variable{
	public void variables() {
		System.out.println("How many mangoes in tree: "+muthu);
		System.out.println("How many neutrons in universe: "+murugan);
	}
}
public class Accessing_InterfaceVariable {

	public static void main(String[] args) {
		// accessing interface variable
		vari ref;
		vari obj=new vari();
		ref=obj;
		ref.variables();

	}

}
