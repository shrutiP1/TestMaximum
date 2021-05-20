import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumber<Z extends Comparable<Z>>
{
	Z num1,num2,num3;
	
	FindMaximumNumber( Z x ,Z y,Z z)
	{
		num1=x;
		num2=y;
		num3=z;
	}
	
	public static <E extends Comparable<E>>E checkMaximum(E x,E y,E z)
	{
		E max;
		if(x.compareTo(y)> 0 && x.compareTo(z)>0)
		{
			System.out.println(x+" iS Maximum");
			max=x;
		}
		else if(y.compareTo(x) >0 && y.compareTo(z)>0)
		{
			System.out.println(y+" is Maximum");
			max=y;
		}
		else
		{
			System.out.println(z+" is Maximum");
			max=z;
		}
		return max;
			
		
	}
	//UC4
	public static <E extends Comparable<E>>void checkMaximum(E[] x)
	{
		E max=Collections.max(Arrays.asList(x));
		printMaximum(max);
	}
	public static <E> void printMaximum(E max)
	{
		System.out.println("The Maximum Element is : "+max );
	}
	public Z testMaximum()
	{
		
		Z max=checkMaximum(num1,num2,num3);
		return max;
	}
    @Test
	public void givenIntegerMaximumAtFirst_WhenProper_returnMaximumNumberAtFirstPosition()
	{
		 Integer arr[]= {7,2,3};
		 Integer max=checkMaximum(7,2,3);
		Assert.assertEquals(arr[0], max);
	}
	@Test
	public void givenIntegerMaximumAtSecond_WhenProper_returnMaximumNumberAtSecondPosition()
	{
		 Integer arr[]= {2,6,3};
		 Integer max=checkMaximum(2,6,3);
		Assert.assertEquals(arr[1], max);
	} 
	@Test
	public void givenIntegerMaximumAtThird_WhenProper_returnMaximumNumberAtThirdPosition()
	{
		 Integer arr[]= {2,6,9};
		 Integer max=checkMaximum(2,6,9);
		Assert.assertEquals(arr[2], max);
	} 
	@Test
	public void givenDoublerMaximumAtFirst_WhenProper_returnMaximumNumberAtFirstPosition()
	{
		 Double arr[]= {7.1,2.2,3.1};
		 Double max=checkMaximum(7.1,2.2,3.1);
		Assert.assertEquals(arr[0], max);
	}
	@Test
	public void givenDoublerMaximumAtSecond_WhenProper_returnMaximumNumberAtFirstPosition()
	{
		 Double max=checkMaximum(7.1,9.2,3.1);
		Assert.assertEquals("9.2", max);
	}
	@Test
	public  void givenDoubleMaximumAtThird_WhenProper_returnMaximumNumberAtThirdPosition()
	{
         Double max=checkMaximum(7.1,9.2,10.1);
		 Assert.assertEquals("10.1", max);
	} 
	@Test
	public void givenStringrMaximumAtFirst_WhenProper_returnMaximumNumberAtFirstPosition()
	{
	    String max=checkMaximum("peach","abc","def");
		Assert.assertEquals("peach", max);
	}
	@Test
	public void givenStringrMaximumAtSecond_WhenProper_returnMaximumNumberAtFirstPosition()
	{
		 String max=checkMaximum("Peach","zbc","def");
		Assert.assertEquals("zbc", max);
	}
	@Test
	public void givenStringrMaximumAtThird_WhenProper_returnMaximumNumberAtFirstPosition()
	{
		String max=checkMaximum("Peach","dbc","zef");
		Assert.assertEquals("zef", max);
	}
    @Test
    public void givenGenricIntegerType_WhenProper_returnMaximum()
    {
       	Integer value=checkMaximum(3, 2, 1);
    	Assert.assertSame(3, value);
    }
    double epsilon=0.00001d;
    @Test
    public void givenGenricDoubleType_WhenProper_returnMaximum()
    {
       	Double value=checkMaximum(3.22,2.87,1.33);
       	System.out.println(value);
    	Assert.assertEquals(3.22, value,epsilon);
    }
    @Test
    public void givenGenricStringType_WhenProper_returnMaximum()
    {
       	String value=checkMaximum("za","raju", "patil");
    	Assert.assertSame("za", value);
    }
	public static void main(String[] args)
	{
		System.out.println("Welcome");
	    Integer arr[]= {1,2,3,4};
	    checkMaximum(arr);
	   
	}	

}
