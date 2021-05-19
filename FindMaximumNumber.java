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
	public static Double checkDoubleMaximum(Double[] x)
	{
		Double max=x[0];
		for(Double e:x)
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
	@Test
	public void givenDoublerMaximumAtFirst_WhenProper_returnMaximumNumberAtFirstPosition()
	{
		 Double arr[]= {7.1,2.2,3.1};
		 Double max=checkDoubleMaximum(arr);
		Assert.assertEquals(arr[0], max);
	}
	@Test
	public void givenDoublerMaximumAtSecond_WhenProper_returnMaximumNumberAtFirstPosition()
	{
		 Double arr[]= {7.1,9.2,3.1};
		 Double max=checkDoubleMaximum(arr);
		Assert.assertEquals(arr[1], max);
	}
	@Test
	public  void givenDoubleMaximumAtThird_WhenProper_returnMaximumNumberAtThirdPosition()
	{
		 Double arr[]= {7.1,9.2,10.1};
		 Double max=checkDoubleMaximum(arr);
		 Assert.assertEquals(arr[2], max);
	} 
	public static void main(String[] args)
	{
		System.out.println("Welcome");
		Integer arr[]= {7,2,3};
	    System.out.println("Maximum number in integer array is "+checkIntMaximum(arr));
	    
	    Double arr1[]= {1.2,2.9,3.4};
	    System.out.println("Maximum number in double array is "+checkDoubleMaximum(arr1));
	    
		
	}	

}
