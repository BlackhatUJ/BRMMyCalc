package assignment1;

import java.util.*;

public class MyCalc {
	int a, b;
	Scanner sc= new Scanner(System.in);
	public void sum()
	{
		
		
		System.out.println("Enter the number a:");
		a=sc.nextInt();
		System.out.println("Enter the number b:");
		b=sc.nextInt();
		
		System.out.println("Addition of "+ a+"+"+b+ " = "+ (a+b));
	
	}
	public void subtract()
	{

		System.out.println("Enter the number a:");
		a=sc.nextInt();
		System.out.println("Enter the number b:");
		b=sc.nextInt();
		System.out.println("Subtraction of "+ a+"-"+b+ " = "+ (a-b));

	}
	public void Multiply()
	{
	
	System.out.println("Enter the number a:");
	a=sc.nextInt();
	System.out.println("Enter the number b:");
	b=sc.nextInt();
	System.out.println("Multiplication of "+a+"x"+b+ " = "+ (a*b));
	}
	public void Division()
	{
	
	System.out.println("Enter the number a:");
	a=sc.nextInt();
	System.out.println("Enter the number b:");
	b=sc.nextInt();
	System.out.println("Division of "+a+"/"+b+ " = "+ (a/b));
	}


	public static void main(String[] args) {
		MyCalc m1= new MyCalc();
		Scanner s1= new Scanner(System.in);
	System.out.println("1. addition 2. subtraction 3. Multiplication 4. Division");
	int	 c= s1.nextInt();
	
		switch(c)
		{
		case 1:
			m1.sum();
		break;
		case 2:
			m1.subtract();
		break;
		case 3:
			m1.Multiply();
		break;
		case 4:
			m1.Division();
		break;
		}
	}
}






	
		

	

