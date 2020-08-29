package com.method_reference;

import java.util.function.BiFunction;

@FunctionalInterface
public interface MyMethodReference {
	
	public double calculate(int x,int y); //MyMethodReference m_div=m::divide;
}

class MathOperation
{
	private int no1;
	private int no2;
	public MathOperation() {
		// TODO Auto-generated constructor stub
	}
	public MathOperation(int  no1,int no2) {
		super();
		this.no1=no1;
		this.no2=no2;
	}
	public double add(int no1,int no2){
		return no1+no2;
	}
	public double sub(int no1,int no2){
		return no1-no2;
	}
	public double multi(int no1,int no2){
		return no1*no2;
	}
	public double divide(int no1,int no2){
		return no1/no2;
	}
	public static void main(String [] args){
		
		MathOperation m=new MathOperation();
//		double ans=m.add(12, 12);
//		System.out.println("add : "+ans);
		
		MyMethodReference m_ref=(a,b)->{
			return m.add(a, b);
			};
		double ans=m_ref.calculate(100,100);
		System.out.println(ans);
		
		MyMethodReference m_mult=(x,y)->{
			return m.multi(x,y);
		};
		
		//Method reference
		MyMethodReference m_div=m::divide;
		double val=m_div.calculate(230, 5);
		System.out.println(val);
		
		BiFunction<Integer, Integer, Double> biFunction=m::add;
		biFunction.apply(new Integer(10), new Integer(100));
	}
	
	
	
	
}
