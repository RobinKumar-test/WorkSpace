package com.kumar.FunPart;

import java.util.function.Function;
import java.util.function.Predicate;

final class FunPartUtilites {

	static Predicate<Integer> fizz= mod-> {
		return mod % 3==0? true:false;
	};
	
	static Predicate<Integer> buzz= mod-> {
		return mod % 5==0? true:false;
	};
	
	static Predicate<Integer> strFizz= locate-> {
		return locate.toString().contains("3");
	};
	
	static Predicate<Integer> strBuzz= locate-> {
		return locate.toString().contains("5");
	};
	
	static Predicate<Integer> fizzBuzz = fizz.and(buzz);
	static Predicate<Integer> fizzWithString= fizz.or(strFizz);
	static Predicate<Integer> fizzBuzzWithFizzString = fizzWithString.and(buzz);
	static Predicate<Integer> buzzWithString = buzz.or(strBuzz);
	static Predicate<Integer> fizzBuzzWithBuzzString = buzzWithString.and(fizz);
	static Predicate<Integer> fizzBuzzWithFizzBuzzString =fizzWithString.and(buzzWithString);

	static Function<Integer,String> funNormal = (Integer value) -> {
		return fizzBuzz.test(value)? "FizzBuzz": fizz.test(value)? "Fizz":buzz.test(value)?"Buzz":value.toString();
	};
	
	static Function<Integer,String> funWithFizz = (Integer value) -> {
		return fizzBuzzWithFizzString.test(value)? "FizzBuzz": fizzWithString.test(value)? "Fizz":buzz.test(value)?"Buzz":value.toString();
	};

	static Function<Integer,String> funWithBuzz =(Integer value) -> {
		return fizzBuzzWithBuzzString.test(value)? "FizzBuzz": fizz.test(value)? "Fizz":buzzWithString.test(value)?"Buzz":value.toString();
	};
	
	static Function<Integer,String> funWithFizzBuzz =(Integer value) -> {
		return fizzBuzzWithFizzBuzzString.test(value)? "FizzBuzz": fizzWithString.test(value)? "Fizz":buzzWithString.test(value)?"Buzz":value.toString();
	};
	
	private FunPartUtilites()
	{
		
	}
}
