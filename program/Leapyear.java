

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int year ;
		System.out.println("Enter year number:");
		
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if((year%4==0)&&(year%100 !=0)||(year%400==0))
		
		{
System.out.println("Leapyear:"+year);		

	}else {
		System.out.println("Not a Leapyear");

}
}
}