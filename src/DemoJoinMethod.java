public class DemoJoinMethod implements Runnable{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("inside child thread");
		}
	}

	// Every join() method calls InterruptedException.
	public static void main(String[] args) throws InterruptedException
	{

		DemoJoinMethod d=new DemoJoinMethod();
		Thread t=new Thread(d);
		t.start();

		/*Main thread will wait for child thread to complete through join()
		Since main thread is waiting on child thread,it will call the join()
		on the thread on which it is waiting.
		 */
		t.join();

		for(int i=0;i<10;i++)
		{
			System.out.println("inside main thread");
		}
	}
}
