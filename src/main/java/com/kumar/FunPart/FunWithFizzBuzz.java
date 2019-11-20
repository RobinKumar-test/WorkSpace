package com.kumar.FunPart;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.kumar.FunFactory.IFunPart;

public class FunWithFizzBuzz implements IFunPart {

	
	@Override
	public List<String> callFuncRequest(List<Integer> classSize) {
		return classSize.stream().map(new Function<Integer,String>()
		{	@Override
			public String apply(Integer value) {
			return fizzBuzzWithFizzBuzzString.test(value)? "FizzBuzz": fizzWithString.test(value)? "Fizz":buzzWithString.test(value)?"Buzz":value.toString();
		}
		}).collect(Collectors.toList());
	}
	

}
