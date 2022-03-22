package com.harman.Thread;
class Programs extends Thread
{

    public void run()
    {
        try{
            System.out.println("Thread excecuted");

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
