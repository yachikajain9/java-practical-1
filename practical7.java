
import java.util.Scanner;
public class Practical7{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("\nyachika jain");
	System.out.println("Enrollment No.: 240390107056\n");
	System.out.println("Enter The 3 Sides Of Triangle: ");
	System.out.println("A: ");
	int a = sc.nextInt();
	System.out.println("B: ");
	int b = sc.nextInt();
	System.out.println("C: ");
	int c = sc.nextInt();
	
		if(a+b > c && b+c > a && a+c > b){
			int s = ((a+b+c)/2);
			double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
			
			System.out.print("The Area Of the Triangle: " + area);
		}
		else{
			System.out.print("The Given Side Does Not Made Triangle.");
		}
	
	}

}

