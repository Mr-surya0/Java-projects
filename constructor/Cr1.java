package com.constructor;
//Constructor can be overloaded
public class Cr1 {
String name,color;
  Cr1(){
	name = "tom";
	color ="gray";
	System.out.println(name+" \n"+color);
  }
  Cr1(String name){
	  this.name =name;
		System.out.println(name);

  }
  Cr1(String name ,String color){
	  this.name =name;
	  this.color=color;
		System.out.println(name+" \n"+color);

  }
	
	public static void main(String[] args) {
      new Cr1();
     new Cr1("minato");
     new Cr1("karlson","pink");
       
      
	}

}
