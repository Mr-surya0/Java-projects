package com.multiThread;

class c extends Thread {
	private String name;
	private static final int finaldistance = 1000;

	public c(String name) {
		this.name = name;
	}

	public void run() {
		int initialdistance = 0;
		while (initialdistance < finaldistance) {
			try {
				int progress = (int) (Math.random() * 100) + 10;
				initialdistance += progress;
				System.out.println(name + ":\t time is running:\t" + initialdistance);
				Thread.sleep(500);

			} catch (Exception e) {
				System.out.println(e);
			}

		}
		if (name == "kumaran") {
			System.out.println(name + " you got ac ticket");
		} else if (name == "surya") {
			System.out.println(name + " you got normal ticket");
		} else {
			System.out.println(name + " ticket is not available");
		}
	}
}

public class fast {

	public static void main(String[] args) {
		c r1 = new c("kumaran");
		c r2 = new c("murugan");
		c r3 = new c("surya");
		r1.start();
		r2.start();
		r3.start();
	}

}
