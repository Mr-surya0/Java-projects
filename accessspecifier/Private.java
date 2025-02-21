package com.accessspecifier;
//private within the class
public class Private {
    private static int p = 2;

    private void ma() {
        System.out.println(p);
    }

    public static void main(String[] args) {
        Private obj = new Private();
        obj.ma();
    }
}

