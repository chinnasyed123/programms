
public class Factorial {

	
public void number_factorial(int num) {
	int dummy=1;
	for(int i=1;i<=num;i++) {
		dummy*=i;
	}
System.out.println("Factorial of the  given number is :"+num+" : "+dummy);	
}
	public static void main(String args[]) {
		Factorial fact = new Factorial();
		fact.number_factorial(5);
		fact.number_factorial(3);
	}
	}



