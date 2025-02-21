package com.CollectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class datas {
	int id;
	String aname;
	int price;
	String roll;

	public datas(int id, String aname, int price, String roll) {
		super();
		this.id = id;
		this.aname = aname;
		this.price = price;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "datas [id=" + id + ", Animename=" + aname + ", price=" + price + ", Roll=" + roll + "]";
	}
}
public class ArraylistDB {
	List<datas> dataMap = new ArrayList<>();
	public void add(datas s) {
		dataMap.add(s);
	}
	public void display() {
		for (datas entry : dataMap) {
			System.out.println(entry);
		}
	}
	public static void main(String[] args) {
		
		Connection connection = DBConnection.getDB();
		ResultSet resultSet = null;
		ArraylistDB jd = new ArraylistDB();
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM anime");
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String aname = resultSet.getString("aname");
				int price = resultSet.getInt("price");
				String roles = resultSet.getString("roles");
				jd.add(new datas(id, aname, price, roles));
			}
		} catch (SQLException e) {
			System.out.println(e);
		} 
		jd.display();
	}
}