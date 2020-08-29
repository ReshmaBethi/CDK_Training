package com.jdkFunctional;

import java.util.function.Predicate;

public class DemoPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p=new Predicate<String>() {
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.equals("CDK");
			}
		};
		System.out.println(p.test("CDK"));
		System.out.println(p.test("cdk"));
		
		Predicate<String>pLambda=(name)->{
			//System.out.println("a");
			return name.length()>5;
		};
		
		System.out.println("Length is greater than 5 :"+pLambda.test("abcde"));
		
		Predicate<String> pLambdaValue=(t)->{
			//System.out.println("b");
			return t.equals("lmnop1");
		};
		
		Predicate<String> pLambdaOr=pLambda.or(pLambdaValue);
		System.out.println(pLambdaOr.test("abcde1"));
		
		Predicate<String> predicate=pLambda.and((data)->{return data.startsWith("f");});
		System.out.println(predicate.test("chello123"));
	}

}
