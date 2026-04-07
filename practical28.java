import java.util.Scanner;
interface Exam {
    boolean isPassed(int mark);
}
interface Classify {
    String getDivision(double average);
}
class Result implements Exam, Classify {
    @Override
    public boolean isPassed(int mark) {
        return mark >= 40;   // Passing marks = 40
    }

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class Practical28 {
    public static void main(String[] args) {
	System.out.println("yachika : 240390107056");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int mark = sc.nextInt();

        System.out.print("Enter average: ");
        double avg = sc.nextDouble();

        Result r = new Result();

        if (r.isPassed(mark)) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        String division = r.getDivision(avg);
        System.out.println("Division: " + division);

        sc.close();
    }
}