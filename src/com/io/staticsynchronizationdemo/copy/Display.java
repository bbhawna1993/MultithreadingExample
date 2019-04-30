package com.io.staticsynchronizationdemo.copy;

public class Display {

	/*this method is made static synchronized to get the regular outputs
	 * thus,we get the following output in regular format in case of multiple threads
	 */
	public static synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{System.out.print("good morning:");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" "+name);
		}
	}
}
