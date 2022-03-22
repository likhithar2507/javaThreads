package com.harman.Thread;

public class Multithread {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            Programs p1 = new Programs();
            p1.start();
        }
    }
}
