package com.kumar.FunFactory;

import java.util.List;
import java.util.function.Predicate;

public interface IFunPart {

	Predicate<Integer> fizz= mod-> {
	return mod % 3==0? true:false;};

	Predicate<Integer> buzz= mod-> {
	return mod % 5==0? true:false;}; 

	Predicate<Integer> strFizz= locate-> {
		return locate.toString().contains("3");
	};
	
	Predicate<Integer> strBuzz= locate-> {
		return locate.toString().contains("5");
	};

	Predicate<Integer> fizzBuzz = fizz.and(buzz);
	Predicate<Integer> fizzWithString= fizz.or(strFizz);
	Predicate<Integer> fizzBuzzWithFizzString = fizzWithString.and(buzz);
	Predicate<Integer> buzzWithString = buzz.or(strBuzz);
	Predicate<Integer> fizzBuzzWithBuzzString = buzzWithString.and(fizz);
	Predicate<Integer> fizzBuzzWithFizzBuzzString =fizzWithString.and(buzzWithString);
	
public List<String>callFuncRequest(List<Integer> classSize);
}
