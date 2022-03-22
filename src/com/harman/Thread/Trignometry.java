package com.harman.Thread;
import java.util.Scanner;
public class Trignometry {

    static class SinFunction extends Thread{
        double x;
        public SinFunction(double x) {
            this.x = x;
        }

        @Override
        public void run() {
            System.out.println("Sin Function="+Math.sin(x));
        }
    }

    static class CosFunction extends Thread{
        double x;
        public CosFunction(double x) {
            this.x = x;
        }

        @Override
        public void run() {
            System.out.println("Cos Function="+Math.cos(x));
        }
    }
    static class TanFunction extends Thread{
        double x;
        public TanFunction(double x) {
            this.x = x;
        }

        @Override
        public void run() {
            System.out.println("Tan Function="+Math.tan(x));
        }
    }
    public static class TrignometricOperations{
        public static void main(String[] args) {
            double theta;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an angle :-  ");
            theta = scan.nextDouble();
            SinFunction sinObj = new SinFunction(Math.toDegrees(theta));
            CosFunction cosObj = new CosFunction(Math.toDegrees(theta));
            TanFunction tanObj = new TanFunction(Math.toDegrees(theta));
            sinObj.start();
            cosObj.start();
            tanObj.start();
        }
    }

}
