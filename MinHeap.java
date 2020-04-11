package demo;

import java.util.Scanner;

public class MinHeap {
	//to reverse a string
	public static String reverseString(String tobereversedstring)
	{
		
		StringBuilder builerforstring=new StringBuilder();
		builerforstring.append(tobereversedstring);
		builerforstring=builerforstring.reverse();
		

		return builerforstring.toString();
	}
	
	public static int reverseInt(int tobereversed)
	{
	
		int reversed=0;
		int reminder;
		boolean isnegative=false;
		
		//checking if negative converting into a positive for ease of  reversal
		if(tobereversed<0)
		{
			tobereversed=tobereversed*-1;
			isnegative=true;
		}
		String beforereverse=String.valueOf(tobereversed);
		
		//reversing the int 
		while(tobereversed>0)
		{	
			reminder=tobereversed%10;
			tobereversed=tobereversed/10;
			reversed=reversed*10+reminder;
			
		}
		
		//checking if the reversed and the reverse of the original were same to ensure to does not overflows 
		//if ture setting reversed to 0
		//calling string reverse in param
		if(!beforereverse.equals(MinHeap.reverseString(String.valueOf(reversed))))
			reversed=0;
		
		//concerting back to negative if negative
		if(isnegative)
			reversed*=-1;
		
		
			
			
		return reversed;
	}
	
	
	
	
	public static void main(String arg[]) throws Exception
	{
		try
		{
			  //declaring scanner to get input
			  System.out.println("Please enter an integer");
		      Scanner scanner=new Scanner(System.in);
		     
		      //getting the int to be fecthed throws error if not a int and if input if overflow
		      int tobereversed=scanner.nextInt();
		      System.out.println("Before Reversing"+"\n"+tobereversed);
		      System.out.println("...*&^Reversing^&*...");
		      //calling method to reverse the int
		      System.out.println("Reversed Int" +"\n"+MinHeap.reverseInt(tobereversed));
			
		}
		catch(Exception exception)
		{
			System.out.println(exception);
		}
		System.out.println("Thank You!");
	
      



	
	}
	
	
	}
