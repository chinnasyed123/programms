import java.util.Scanner;

public class Even_or_odd {
public static void main(String args[]) {
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Number");
	num= sc.nextInt();
	if(num%2==0) {
		System.out.println("Number is Even : "+num);
	}else {
		System.out.println("Number is odd :"+num);
	}

}
}
