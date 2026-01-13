
import java.util.Scanner;
public class Practical5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nBhoomika Maheshwari");
		System.out.println("Enrollment No.: 240390107056\n");
		System.out.println("Enter Any integer Amount To Be Dispensed: ");
		int a = sc.nextInt();
		
		int notes;
		
		System.out.println("Your Given Amount in Currency is Mantioned as Below: ");
		notes = a/100;
		System.out.println("100: "+ notes);
		a = a%100;
		notes = a/50;
		System.out.println("50: "+ notes);
		a = a%50;
		notes = a/10;
		System.out.println("10: "+ notes);
		a = a%10;
		notes = a/5;
		System.out.println("5: "+ notes);
		a = a%5;
		notes = a/2;
		System.out.println("2: "+ notes);
		a = a%2;
		notes = a/1;
		System.out.println("1: "+ notes);
		a = a%1;
	}
}

