package com.kumar.FunPart;

import static com.kumar.FunPart.FunPartUtilites.funWithFizz;
import static com.kumar.FunPart.FunPartUtilites.funWithBuzz;
import static com.kumar.FunPart.FunPartUtilites.funWithFizzBuzz;
import static com.kumar.FunPart.FunPartUtilites.funNormal;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.function.Function;
import org.junit.Before;
import org.junit.Test;
import com.kumar.FunPart.FunPart;

public class FunPartTest {
	
	FunPart testObj;
	Function<Integer, String> testMappingFun;
	final int CLASS_SIZE=100;
	@Before
	public void setup()
	{
		testObj = new FunPart(CLASS_SIZE);
		
	}
	
	@Test
	/**
	 * To test Fizz for divisible by 3, Buzz for divisible by 5 FizzBuzz divisible both by 3 and 5
	**/
	public void testFirstReq() 
	{
		testMappingFun = funNormal;
		List<String> firstReq= testObj.callFunRequest(1);
		assertEquals("FizzBuzz",testMappingFun.apply(15));
		assertEquals("FizzBuzz",firstReq.get(14)); 
		assertEquals("Fizz",testMappingFun.apply(12));
		assertEquals("Buzz",testMappingFun.apply(10));
		assertEquals("2",testMappingFun.apply(2));
		
		
	}
	
	@Test
	
	/**
	 * To test A number is Fizz if it is divisible by 3 or if it has 3 in it
	**/
	public void testSecondReq() 
	{
		testMappingFun = funWithFizz;
		List<String> secondReq = testObj.callFunRequest(2);
		assertEquals("FizzBuzz",testMappingFun.apply(35));
		assertEquals("FizzBuzz",secondReq.get(34));
		assertEquals("Fizz",testMappingFun.apply(23));
		assertEquals("Buzz",testMappingFun.apply(10));
		assertEquals("8",testMappingFun.apply(8));
		
				
	}
	
	@Test
	/**
	 * To test A number is Buzz if it is divisible by 5 or if it has 5 in it
	 **/
	public void testThirdReq() 
	{
		testMappingFun = funWithBuzz;
		List<String> thirdReq = testObj.callFunRequest(3);
		assertEquals("FizzBuzz",testMappingFun.apply(54));
		assertEquals("FizzBuzz",thirdReq.get(53));
		assertEquals("Fizz",testMappingFun.apply(9));
		assertEquals("Buzz",testMappingFun.apply(52));
		assertEquals("16",testMappingFun.apply(16));
		
	}

	@Test
	/**
	 * To test  A number is FizzBuzz if it satisfy above 2 criterias together
	 **/
	public void testFourthReq() 
	{
		testMappingFun = funWithFizzBuzz;
		List<String> fourthReq = testObj.callFunRequest(4);
		assertEquals("FizzBuzz",testMappingFun.apply(57));
		assertEquals("FizzBuzz",fourthReq.get(56));
		assertEquals("Fizz",testMappingFun.apply(37));
		assertEquals("Buzz",testMappingFun.apply(59));
		assertEquals("22",testMappingFun.apply(22));
		
		
	}
	
}
