package com.harman.Thread;
import java.util.Scanner;


    class Addopt extends Thread{
        int x,y;
        public Addopt(int x,int y) {
            this.x=x;
            this.y=y;
        }
        public void run() {
            System.out.println("Addition :"+(x+y));
        }
    }
    class Subopt extends Thread{
        int x,y;
        public Subopt(int x,int y) {
            this.x=x;
            this.y=y;
        }
        public void run() {
            System.out.println("Subtraction :"+(x-y));
        }
    }
    class Mulopt extends Thread{
        int x,y;
        public Mulopt(int x,int y) {
            this.x=x;
            this.y=y;
        }
        public void run() {
            System.out.println("Multiplication :"+(x*y));
        }
    }
    class Divopt extends Thread{
        int x,y;
        public Divopt(int x,int y) {
            this.x=x;
            this.y=y;
        }
        public void run() {
            System.out.println("Division :"+(x/y));
        }
    }
    public class CalculatorThread {
        public static void main(String args[]) {
            int a,b;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter num 1 :");
            a=s.nextInt();
            System.out.println("Enter num 1 :");
            b=s.nextInt();
            Addopt add=new Addopt(a,b);
            Subopt sub=new Subopt(a,b);
            Mulopt mul=new Mulopt(a,b);
            Divopt div=new Divopt(a,b);

            add.start();
            sub.start();
            mul.start();
            div.start();
        }

    }

