class University{
 static int totalStudents ;
static String universityName ;
 static{
universityName = "GTU";
totalStudents = 0;
System.out.println("static block executed");
 System.out.println("University Name Initialized: " + universityName);
    }
    {
        System.out.println("Instance Block Executed -");
        totalStudents++;
    }

        University() {
        System.out.println("Constructor Executed");
    }

   
    static int getTotalStudents() {
        return totalStudents;
    }

        public static void main(String[] args) {

        System.out.println("Main Method Started");

        University s1 = new University();
        University s2 = new University();
	University s3 = new University();



        System.out.println("Total Students: " + University.getTotalStudents());
    }
}
