class Time {
// data transfer 
int hours;
 int minutes ;
void setTime(int h,int m)
{
   hours = h ;
   minutes = m;

}
void addTime(Time t1,Time t2)
{
  hours = t1.hours+t2.hours ;
   minutes = t1.minutes+ t2.minutes ;

   if(minutes >= 60)
{
    hours = hours+(minutes/60);
     minutes = minutes%60 ;


}

}

void displayTime()
{
  
  System.out.println("Time :"+hours+"hours"+minutes +"minutes") ;
//System.out.println("Time :"+)
}

    public static void main(String[]args){
	System.out.println("  240390107056");

        Time t1 = new Time();
         Time t2 = new Time();
	Time t3 = new Time();
   // set time values 
       t1.setTime(2,45) ;
      t2.setTime(1,30) ;
      t3.addTime(t1,t2) ;
      t3.displayTime() ;
}
}