import java.util.Scanner;
class P4
{
    public static void main(String args[])
	{
		
                Scanner sc=new Scanner(System.in);
		float a,b,c,d,BMI;

		System.out.print("Enter Weight(in lbs):");
		a=sc.nextFloat();
		System.out.print("Enter Height(in inches):");
		b=sc.nextFloat();
		c=a*0.45359237f;
		d=b*0.0254f;
		BMI=c/(d*d);
		System.out.print("BMI="+BMI);


}
}
