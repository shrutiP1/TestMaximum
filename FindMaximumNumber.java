import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumber
{
	public static Integer checkIntMaximum(Integer[] x)
	{
		Integer max=x[0];
		for(Integer e:x)
		{
			if(e.compareTo(max)>0)
			{
				max=e;
			}
		}
		return max;
	}
	@Test
	public void givenIntegerMaximumAtFirst_WhenProper_returnMaximumNumberAtFirstPosition()
	{
		 Integer arr[]= {7,2,3};
		 Integer max=checkIntMaximum(arr);
		Assert.assertEquals(arr[0], max);
	}
	@Test
	public void givenIntegerMaximumAtSecond_WhenProper_returnMaximumNumberAtSecondPosition()
	{
		 Integer arr[]= {2,6,3};
		 Integer max=checkIntMaximum(arr);
		Assert.assertEquals(arr[1], max);
	} 
	@Test
	public void givenIntegerMaximumAtThird_WhenProper_returnMaximumNumberAtThirdPosition()
	{
		 Integer arr[]= {2,6,9};
		 Integer max=checkIntMaximum(arr);
		Assert.assertEquals(arr[2], max);
	} 
	public static void main(String[] args)
	{
		System.out.println("Welcome");
		Integer arr[]= {7,2,3};
	    System.out.println("Maximum number in integer array is "+checkIntMaximum(arr));
	    
		
	}	

}
