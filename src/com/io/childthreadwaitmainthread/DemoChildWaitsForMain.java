package com.io.childthreadwaitmainthread;

class DemoChild implements Runnable
{
	static Thread mt;
	@Override
	public void run() {
		try
		//calling the join method on main thread instance so that it waits for main 
		//thread to complete exceution.
		{mt.join();}
		catch(InterruptedException e){}
		for(int i=0;i<10;i++)
		{
			System.out.println("inside child thread");
		}
	}
}

public class DemoChildWaitsForMain {

	public static void main(String[] args) throws InterruptedException
	{
		/*Through this,we are getting the instance of main thread,will is used by
		child thread to call join so that it waits for main thread.*/
		DemoChild.mt=Thread.currentThread();

		DemoChild d=new DemoChild();
		Thread t=new Thread(d);
		t.start();

		for(int i=0;i<10;i++)
		{
			System.out.println("inside main thread");
		}



	}

}
