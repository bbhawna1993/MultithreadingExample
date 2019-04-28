package com.io.childthreadwaitmainthread;

/*Since both main thread and child thread are waiting on each other to exceute
 * ,this is termed as DEADCLOCK
 */
class Mythread implements Runnable
{
	public static Thread mt;
	@Override
	public void run() {

		try {
			//child thread waiting on main thread to execute
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++)
		{System.out.println("inside child thread");}
	}
}

public class DemoDeadlock {

	public static void main(String[] args) throws InterruptedException
	{
		Mythread.mt=Thread.currentThread();
		Mythread r=new Mythread();
		Thread t=new Thread(r);
		t.start();

		//main thread waiting on child thread to execute
		t.join();

		for(int i=0;i<10;i++)
		{
			Thread.sleep(500);
			System.out.println("main thread");
		}
	}

}
