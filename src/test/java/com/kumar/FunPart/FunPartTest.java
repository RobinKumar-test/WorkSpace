package com.kumar.FunPart;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;





public class FunPartTest {
	
	FunPartFactory funFactory;
	List<Integer>funList;
	final int CLASS_SIZE=100;
	
	@Before
	public void setup()
	{
		funFactory = new FunPartFactory();
		funList = new ArrayList<Integer>();
		for(Integer tmp=1;tmp<=CLASS_SIZE;tmp++)
		{
			funList.add(tmp);
		}
		
	}
	
	@Test
	/**
	 * To test Fizz for divisible by 3, Buzz for divisible by 5 FizzBuzz divisible both by 3 and 5
	**/
	public void testFirstReq() 
	{
		List<String> firstReq= funFactory.create(1).callFuncRequest(funList);
		assertEquals("FizzBuzz",firstReq.get(14));
		assertEquals("Fizz",firstReq.get(11));
		assertEquals("Buzz",firstReq.get(9));
		assertEquals("2",firstReq.get(1));
		
		
	}
	
	@Test
	
	/**
	 * To test A number is Fizz if it is divisible by 3 or if it has 3 in it
	**/
	public void testSecondReq() 
	{
		List<String> secondReq= funFactory.create(2).callFuncRequest(funList);
		assertEquals("FizzBuzz",secondReq.get(34));
		assertEquals("Fizz",secondReq.get(22));
		assertEquals("Buzz",secondReq.get(9));
		assertEquals("8",secondReq.get(7));
	}
	
	@Test
	/**
	 * To test A number is Buzz if it is divisible by 5 or if it has 5 in it
	 **/
	public void testThirdReq() 
	{		
		List<String> thirdReq = funFactory.create(3).callFuncRequest(funList);
		assertEquals("FizzBuzz",thirdReq.get(53));
		assertEquals("Fizz",thirdReq.get(8));
		assertEquals("Buzz",thirdReq.get(51));
		assertEquals("16",thirdReq.get(15));
	}

	@Test
	/**
	 * To test  A number is FizzBuzz if it satisfy above 2 criterias together
	 **/
	public void testFourthReq() 
	{
		List<String> fourthReq = funFactory.create(4).callFuncRequest(funList);
		assertEquals("FizzBuzz",fourthReq.get(56));
		assertEquals("Fizz",fourthReq.get(36));
		assertEquals("Buzz",fourthReq.get(58));
		assertEquals("22",fourthReq.get(21));	
	}
	
}
