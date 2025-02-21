package com.productMap;

import java.util.HashMap;

class product{
	String proId;
	String proName;
	int qty;
	public product(String proId, String proName, int qty) {
		this.proId = proId;
		this.proName = proName;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "product [proId=" + proId + ", proName=" + proName + ", qty=" + qty + "]";
	}
}

public class Compiletime_product_map {

	public static void main(String[] args) {
HashMap<Integer,product> obj =new HashMap<Integer,product>();

product p= new product("s1","cinthol",1);
product p1=new product("s2","pistol",2);
product p2=new product("s3","medimix",3);

obj.put(4, p);
obj.put(5, p1);
obj.put(6, p2);

System.out.println(obj);
	}

}
