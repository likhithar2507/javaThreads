package com.harman.Thread;

class ThreadDemo implements Runnable {
    @Override
    public void run(){
        System.out.println("thread excecuted");
        }
public static void main(String[]args){
        ThreadDemo d= new ThreadDemo();
        Thread obj=new Thread(d);
        obj.start();
        }
}
