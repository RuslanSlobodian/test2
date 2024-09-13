package com.example;

public class Main {
    private int a;

    @Override
    public String toString() {
        return "Main{" +
                "a=" + a +
                '}';
    }



    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        System.out.println("Hello !");
    }
}