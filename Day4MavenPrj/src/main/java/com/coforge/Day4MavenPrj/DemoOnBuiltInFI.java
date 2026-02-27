package com.coforge.Day4MavenPrj;

import java.util.function.Consumer;
import java.util.function.Function;
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
		
	}

}
