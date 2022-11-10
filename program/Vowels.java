import java.util.Scanner;

public class Vowels {

	public static void Vowel(char r) {
		
		if((r=='a')||(r=='e')||(r=='i')||(r=='o')||(r=='u')||(r=='A')||(r=='E')||(r=='I')||(r=='O')
				||(r=='U')) {
			System.out.println("enter char is an vowel :"+r);
		}else {
			System.out.println("Enter char is an constant :" +r);
		}
		

	
}
	
	public static void main(String args[]) {
	
	Vowel('e');
	Vowel('r');
	
	}

}
