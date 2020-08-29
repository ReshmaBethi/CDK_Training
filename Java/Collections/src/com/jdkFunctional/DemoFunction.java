package com.jdkFunctional;

import java.util.function.Function;

public class DemoFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data=new int[]{12,12,33,56};
		Function<int[],Integer> fun=(arr)->{
			int total=0;
			for(int i: arr){
				total+=i;
			}
			return total;
		};
		System.out.println(fun.apply(data));
		
		Function<int[], Integer> fun1=(arr)->{
			int min=arr[0];
			for(int i:arr){
				if(min>i)
					min=i;
			}
			return min;
		};
		
		System.out.println("Minimum is "+fun1.apply(data));
		
		Function<int[], Integer> fun2=(arr)->{
			int max=arr[0];
			for(int i:arr){
				if(max<i)
					max=i;
			}
			return max;
		};
		
		System.out.println("Maximum is "+fun2.apply(data));
		
		Function<int[], int[]>fun3=(arr)->{
			int[] arr1 = new int[arr.length];
			int j=0;
			for(int i:arr){
				if(i%2==0){
					arr1[j]=i;
					j++;
				}
			}
			return arr1;
		};
		int[] even=fun3.apply(data);
		for(int i: even){
			System.out.println(i);
		}
		System.out.println(fun3.andThen(fun).apply(data));
	}

}
