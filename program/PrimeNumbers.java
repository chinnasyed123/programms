import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
int num;
boolean flag=false;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
num= sc.nextInt();
for(int i =2;i<=num;i++) {
	if(num%i==0) {
	 flag = true;
	break;
	}
}
if(!flag) {
	System.out.println(" number is Prime Number :"+num);
}else {
	System.out.println("number is not a prime number :"+num);
}
	}
	
}
