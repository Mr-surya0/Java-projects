package com.project;
abstract class v
{
	private String make;
	private String model;
	private int year;
	
	

	public v(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	
	public abstract void start();
	

	public abstract void brake();
	public abstract void accelrate();


public String getmake()
{
	return make;
}

public String getmodel() 
{
	return model;
}

public int getyear() 
{
	return year;

}
}
class car extends v{

	

	public car(String make, String model, int year) {
		super(make, model, year);
	}

	@Override
	public void start() {
		System.out.println("Car is starting... ");
	}

	@Override
	public void brake() {
		System.out.println("Car is braking...");
	}

	@Override
	public void accelrate() {
		System.out.println("Car is accelerating...");
	}
	
}

class bike extends v {

	

	public bike(String make, String model, int year) {
		super(make, model, year);
	}

	@Override
	public void start() {
		System.out.println("Bike is starting...");
	}

	@Override
	public void brake() {
		System.out.println("Bike is braking...");
	}

	@Override
	public void accelrate() {
		System.out.println("Bike is accelerating...");
	}
	
}

class truck extends v{

	

	public truck(String make, String model, int year) {
		super(make, model, year);
	}

	@Override
	public void start() {
		System.out.println("Truck is Starting...");
	}

	@Override
	public void brake() {
		System.out.println("Truck is braking...");
	}

	@Override
	public void accelrate() {
		System.out.println("Truck is accelerating...");
	}
}
public class p1  {

	public static void main(String[] args) {
v car = new car("honda","unicorn",1999);
v bike=new bike("ktm","rc",2001);
v truck = new truck("mahendra","eitcher",2000);
System.out.println("\n------------------------");
System.out.println(car.getmake()+" "+car.getmodel()+" "+car.getyear());

car.start();
car.accelrate();
car.brake();

System.out.println("\n------------------------");

System.out.println(bike.getmake()+" "+bike.getmodel()+" "+bike.getyear());

bike.start();
bike.accelrate();
bike.brake();

System.out.println("\n------------------------");System.out.println(truck.getmake()+" "+truck.getmodel()+ truck.getyear());

truck.start();
truck.accelrate();
truck.brake();
	}

}
