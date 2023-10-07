package com.sept05.JavaFeature;

@FunctionalInterface
interface Subtraction{
	int sub(int a,int b);
}
public class LambdaEx2 {

	
	public static void main(String[] args) {

Subtraction sob=(i,j)->{
	int ans=i-j;
	return ans;
};
System.out.println("difference is "+sob.sub(20, 10));

Subtraction sob1=(i,j)->(i-j);
System.out.println("Difference is "+sob.sub(10,40));
	}

}
