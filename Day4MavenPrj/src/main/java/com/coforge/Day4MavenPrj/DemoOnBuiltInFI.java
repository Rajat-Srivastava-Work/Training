package com.coforge.Day4MavenPrj;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class DemoOnBuiltInFI {
	public static void main(String[] args) {
		Supplier<String> sayHello = ()->"Hello";
		System.out.println(sayHello.get());
		
		Supplier<Double> randomSupplier = ()-> Math.random();
		System.out.println(randomSupplier.get());
		
		Supplier<Integer> otpSupplier = ()-> (int) (Math.random()*1000000);
		System.out.println(otpSupplier.get());
		
		//consumer
		Consumer<String> strConsumer=(str1)-> System.out.println(str1.toUpperCase());
		strConsumer.accept("Rajat");
		
		Consumer<Integer> squareConsumer=(num)->System.out.println(num*num);
		for(int i=1;i<=10;i++)
			squareConsumer.accept(i);
		
		Consumer<Integer> factorialConsumer=(num)->{
			int fact=1;
			for(int i=1;i<=num;i++)
				fact=fact*i;
			System.out.println(fact);
		};
		
		factorialConsumer.accept(5);
		
		//function
		Function<Integer,Boolean> isEven = (num)-> {
			if(num%2==0)
				return true;
			else
				return false;
		};
		
		System.out.println(isEven.apply(54));
		
		//Predicate
		Predicate<Integer> checkEven = (num)->num%2==0;
		System.out.println(checkEven.test(34));
		
		Predicate<String> chkLength=(str)->str.length()>5;
		System.out.println(chkLength.test("Rajat"));
		
		Predicate<String> authenticateUsername = (uname)->uname.equals("Rajat");
		Predicate<String> authenticatePassword=(pwd)->pwd.equals("Rajat123");
		
		String result = authenticateUsername.test("Rajat") && authenticatePassword.test("Rajat123") ? "Authentication successfull" : "Invalid Credentials";
		System.out.println(result);
		
		Predicate<String> validateUsername = (uname) -> uname.length()>3 && !(uname.charAt(0)==' ') && uname!=null && !uname.isBlank();
		System.out.println(validateUsername.test("Rajat"));
	}

}
