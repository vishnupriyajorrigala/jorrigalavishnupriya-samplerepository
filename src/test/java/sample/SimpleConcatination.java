package sample;

import java.util.Scanner;

import org.testng.annotations.Test;

public class SimpleConcatination {
@Test

	public void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name:");
		String str1=sc.nextLine();
		System.out.println("enter last name:");
		String str2=sc.nextLine();	
		String s=str1+str2;
		System.out.println("Hello"+" "+s);

	}

}
