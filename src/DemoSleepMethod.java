
public class DemoSleepMethod {

	public static void main(String[] args) throws InterruptedException{

		for(int i=0;i<10;i++)
		{
			System.out.println("slide-"+i);
			Thread.sleep(5000);
		}
	}

}
