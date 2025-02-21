package com.CollectionDB;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.HashSet;
	import java.util.Set;
		class data {
			int id;
			String name;
			int salary;
			String sex;
			public data(int id, String name, int salary, String sex) {
				super();
				this.id = id;
				this.name = name;
				this.salary = salary;
				this.sex = sex;
			}
			@Override
			public String toString() {
				return "data [id=" + id + ", name=" + name + ", salary=" + salary + ", sex=" + sex + "]";
			}
		}
		public class JDBCSet {
			Set<data> dataMap = new HashSet<>();

			public void add(data s) {
				dataMap.add(s);
			}

			public void display() {
				for (data entry : dataMap) {
					System.out.println(entry);
				}
			}
			public static void main(String[] args) {
				String url = "jdbc:postgresql://localhost:5432/company";
				String username = "postgres";
				String password = "sqlsurya";

				Connection connection = null;
				Statement statement = null;
				ResultSet resultSet = null;
				JDBCSet jd = new JDBCSet();
				try {
					connection = DriverManager.getConnection(url, username, password);

					statement = connection.createStatement();
					resultSet = statement.executeQuery("SELECT * FROM employee where dno=8");
					while (resultSet.next()) {
						int id = resultSet.getInt("dno");
						String name = resultSet.getString("fname");
						int salary = resultSet.getInt("salary");
						String sex = resultSet.getString("sex");
						jd.add(new data(id, name, salary, sex));
					}
				} catch (SQLException e) {
					System.out.println(e);
				} 
				jd.display();
			}
		}
