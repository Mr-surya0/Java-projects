package com.oops;
 class demo{
	 int strId;
	 String strName;
	 int strAge;
	public int getStrId() {
		return strId;
	}
	public void setStrId(int strId) {
		this.strId = strId;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getStrAge() {
		return strAge;
	}
	public void setStrAge(int strAge) {
		this.strAge = strAge;
	}
	@Override
	public String toString() {
		return "demo [strId=" + strId + ", strName=" + strName + ", strAge=" + strAge + "]";
	}
 } 
public class AbstractionAndEncapsulation {

	public static void main(String[] args) {
            demo obj = new demo();
            
            obj.setStrId(10);
            obj.setStrName("murugan");
            obj.setStrAge(10);
            System.out.println(obj );
	}

}
