package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.multi("011110", "10001010"));
        System.out.println(bins.sum("0111110", "011110"));
    }
}