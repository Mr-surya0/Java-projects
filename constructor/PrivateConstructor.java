package com.constructor;
public class PrivateConstructor {
    private PrivateConstructor() {
      System.out.println("welcome");
    }

    public static void main(String[] args) {
      new PrivateConstructor();
        
    }
}
