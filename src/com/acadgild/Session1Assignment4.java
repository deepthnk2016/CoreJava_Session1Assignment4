package com.acadgild;

import java.util.Scanner;
/**
 * 
 * @author Deepak
 * @descr  Implement type casting between different datatypes
 */
public class Session1Assignment4 {

	public static void main(String[] args) {
		// Variable declaration
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		
		
		Scanner input=new Scanner(System.in);
		
		//Accept byte input from user
		System.out.print("Enter byte number - ");
		b=input.nextByte();
		
		//Accept short type input from user
		System.out.print("Enter short number - ");
		s=input.nextShort();
		
		//Save the sum in integer
		i=(int)b+s;
		System.out.println("Sum in integer is "+i);
		
		//Save the sum in long
		l=(long)b+s;
		System.out.println("Sum in long is "+l);
		
		//Save the sum in float
		f=(float)b+s;
		System.out.println("Sum in float is  "+f);
		
		//Save the sum in double
		d=(double)b+s;
		System.out.println("Sum in double is "+d);
		
		input.close();
	}

}
