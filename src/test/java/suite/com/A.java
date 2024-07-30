package suite.com;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class A {
	
	@Test
	public void t1()
	{
		System.out.println("T1");
		
	}
	@Test
	public void t2()
	{
		Assert.assertTrue(false);
		
	}
	@Ignore
	@Test
	public void t3()
	{
		System.out.println("T3");

	}
	@Test
	public void t4()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void t5()
	{
		System.out.println("T5");
	}
	

}
