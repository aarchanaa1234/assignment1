package ASSINGMENT_1;

import java.util.Scanner;

public class qution1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("input the first number");
		int num1=in.nextInt();
		
		System.out.print("input the second number");
		int num2=in.nextInt();
		
		System.out.print("input the third number");
		int num3=in.nextInt();
		
		if(num1>num2)
		if(num1>num3)
			System.out.println("the gretest:"+num1);
		if(num2>num1)
		if(num2>num3)
			System.out.println("the gretest:"+num2);
		if(num3>num1)
		if	(num3>num2)
			System.out.println("the gretest:"+num3);

	}

}
