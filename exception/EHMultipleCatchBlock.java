package com.exception;


public class EHMultipleCatchBlock {
    public static void main(String[] args) {
        try {int a=10/0;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (NullPointerException np) {
            System.out.println(np);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



