package vtiger.Practice;

import org.testng.annotations.Test;

public class DebuggingPractice {
	
	@Test
	public void test()
	{
		System.out.println("Division");
		System.out.println("Now");
		int value = DebuggingPractice.divide(20, 10);
		System.out.println(value);
		
	}
	
	public static int divide(int a, int b)
	{
		int c = a/b;
		return c;
	}

}
