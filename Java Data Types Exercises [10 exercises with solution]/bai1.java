package phan10;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		     double f,c;
		      Scanner key = new Scanner(System.in);
		      System.out.println("Input a degree in Fahrenheit:");
		      f = key.nextDouble();
		      c = (f-32)/1.8;
		      System.out.println(f+"Fahrenheit ="+c+" Celsius");
	}

}
