class Mythread implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("I am a lazy thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("I got interrupted");
			}
		}

	}

}
public class DemoInterrupted {

	public static void main(String[] args) {

		Mythread r=new Mythread();
		Thread t=new Thread(r);
		t.start();

		/*
		 * main thread is interrupting child thread
		 * interrupt method is usually called on sleep method
		 */
		t.interrupt();

		for(int i=0;i<10;i++)
		{
			System.out.println("inside main thread");
		}
	}

}





