package com.multiThread;

 class Murugan {
    synchronized public void add(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i+10-5);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Murugan2 extends Thread {
    private Murugan m;

    public Murugan2(Murugan m) {
        this.m = m;
    }

    public void run() {
        m.add(10);
        m.add(5);
    }
}

public class Synchronised {
    public static void main(String[] args) {
        Murugan murugan = new Murugan();
        Murugan2 murugan2 = new Murugan2(murugan);
        murugan2.start();
    }
}
