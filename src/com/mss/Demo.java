package com.mss;

import java.util.Scanner;

public class Demo {
	public static void main(String args[])
	{
		System.out.println("hello world");
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value");
		n=scan.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}
