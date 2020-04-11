package demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSubstring {
	
	public static void main(String h[])
	{
		Set<Character> setofchar=new HashSet<>();
		System.out.println("Enter the string to be substringed");
		Scanner scanner =new Scanner(System.in);
		
		String substring=scanner.next();
		
		int result=0;
		
		
		
		for(int i=0;i<substring.length();i++)
		{
			if(!setofchar.add(substring.charAt(i)))
			{
				setofchar.clear();
				setofchar.add(substring.charAt(i));
			}
		
			if(setofchar.size()>result)
				result=setofchar.size();
			
			//System.out.println(result);
			
		}
		
		System.out.println(result);
	}

}
