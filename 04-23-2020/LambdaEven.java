package com.shub;

public class LambdaEven {
	
	public static void main(String[] args) {
	
	Even even = (int a) -> {
		if(a%2==0){
			System.out.println("Number "+a+" is even.");
		}else{
			System.out.println("Number "+a+" is odd.");
		}
	};

	
	
	//Check numbers
	even.check(5);
	even.check(8);
}
}
	


