package com.exception;


public class EHMultiCatchBlock {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException | NullPointerException obj) {
            System.out.println(obj);
        }
    }
}
