package baitap;
import java.util.*;
public class Bai65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		int divided = a / b;
		int result = a - (divided * b);
		System.out.println(result); 
	}

}
