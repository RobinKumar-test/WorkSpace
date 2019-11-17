package com.kumar.FunPart;

import static com.kumar.FunPart.FunPartUtilites.funNormal;
import static com.kumar.FunPart.FunPartUtilites.funWithBuzz;
import static com.kumar.FunPart.FunPartUtilites.funWithFizz;
import static com.kumar.FunPart.FunPartUtilites.funWithFizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FunPart {

	List<Integer>funList;
	
	/**
	 * Overloaded constructor which take size of the class room
	 * @param classSize
	 */
	public FunPart(int classSize)
	{
		funList = new ArrayList<Integer>();
		for(Integer tmp=1;tmp<=classSize;tmp++)
		{
			funList.add(tmp);
		}
		
	}
	
	/**
	 * Function which calls the FunRequest based on the Request number 
	 * 1. Fizz for divisible by 3, Buzz for divisible by 5 FizzBuzz divisible both by 3 and 5
	 * 2. A number is Fizz if it is divisible by 3 or if it has 3 in it
	 * 3. A number is Buzz if it is divisible by 5 or if it has 5 in it
	 * 4. A number is FizzBuzz if it satisfy above 2 criterias together
	 * @param request
	 * @return
	 */
	public List<String> callFunRequest(int request){
	List<String> result=null;
	switch(request)
	{
	case 1:{
			result=funList.stream().map(x->funNormal.apply(x)).collect(Collectors.toList());
			break;
			}
	case 2:
			{
			result=funList.stream().map(x->funWithFizz.apply(x)).collect(Collectors.toList());
			break;
			}
	case 3:
			{
			result=funList.stream().map(x->funWithBuzz.apply(x)).collect(Collectors.toList());
			break;
			}
	case 4:
			result=funList.stream().map(x->funWithFizzBuzz.apply(x)).collect(Collectors.toList());
	}
	return result;
}
	
	public static void main(String[] args) {
		new FunPart(100).callFunRequest(1);

	}

}
