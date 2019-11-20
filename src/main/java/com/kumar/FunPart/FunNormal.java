package com.kumar.FunPart;


import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.kumar.FunFactory.IFunPart;

public class FunNormal implements IFunPart {

	/**
	 * Mapping Function for Fizz for divisible by 3, Buzz for divisible by 5 FizzBuzz divisible both by 3 and 5 
	 */
	@Override
	public List<String> callFuncRequest(List<Integer> classSize) {
	return classSize.stream().map(new Function<Integer,String>(){
		@Override
		public String apply(Integer value) {
			return fizzBuzz.test(value)? "FizzBuzz": fizz.test(value)? "Fizz":buzz.test(value)?"Buzz":value.toString();
		}
		}).collect(Collectors.toList());
	}		
}
