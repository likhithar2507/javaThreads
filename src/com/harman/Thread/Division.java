package com.harman.Thread;
import java.util.Scanner;

    class Division extends Thread{
        int x;
        public Division(int x) {
            this.x=x;
        }
        public void run() {
            if(x%8==0) {
                System.out.println(x+" is divisible by 8.");
            }
            else {
                System.out.println(x+" is not divisible by 8.");
            }
        }
    }
    class EvenOdd extends Thread{
        int x;
        public EvenOdd(int x) {
            this.x=x;
        }
        public void run() {
            if(x%2==0) {
                System.out.println(x+" is Even number");
            }
            else {
                System.out.println(x+" is Odd number");
            }
        }
    }
    class PrintPrime extends Thread{
        public void run() {
            int n;
            for (n = 2; n <= 500; n++) {
                double limit = Math.sqrt(n);
                int i;
                for (i = 2; i <= limit; i++) {
                    if (n % i == 0) {
                        break;
                    }
                }
                if (i > limit) {
                    System.out.print(n + " ");
                }
            }
        }
    }
    class CheckPrime extends Thread{
        int x;
        public CheckPrime(int x) {
            this.x=x;
        }
        public void run() {
            boolean flag = false;
            for (int i = 2; i <= x / 2; ++i) {
                if (x % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(x+ " is a prime number.");
            else
                System.out.println(x+ " is not a prime number.");
        }
    }
class Task {

    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number :");
        a=s.nextInt();

        Division div=new Division(a);
        EvenOdd eveod=new EvenOdd(a);
        PrintPrime pm=new PrintPrime();
        CheckPrime cpm=new CheckPrime(a);

        div.start();
        eveod.start();
        pm.start();
        cpm.start();

    }

}


