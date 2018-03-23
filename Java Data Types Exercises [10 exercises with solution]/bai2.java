package phan10;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i,m;
      Scanner key = new Scanner(System.in);
      System.out.println("Input a value for inch:");
      i = key.nextDouble();
      m = i*0.0254;
      System.out.println(i+"inch ="+m+"meters");
	}

}
