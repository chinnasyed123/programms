import java.util.Scanner;

public class LargestNumber {
public static void main(String args[]) {
	int num1, num2,num3;
	Scanner sc = new Scanner(System.in);
System.out.println("Enter your number num1 :");
num1= sc.nextInt();
System.out.println("Enter your number num2 :");
num2= sc.nextInt();
System.out.println("Enter your number num3 :");
num3= sc.nextInt();
if((num1>=num2)&&(num1>=num3)) {
	System.out.println("num1 is Larger number :"+num1);
	
}else if ((num2>=num3)&&(num2>=num1)) {
	System.out.println("num2 is Larger number :"+num2);

}else {
	System.out.println("num3 is the Bigger number :"+num3);
}

}
}
