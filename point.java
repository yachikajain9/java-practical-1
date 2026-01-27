 import java.util.Scanner ;
class Point{
   int x;
   int y ;

Point(){
 x = 5;
 y = 5;

}
Point(int a , int b){
  x = a ; 
 y = b ;
}
Point( Point p ){
x = p.x;
y =  p.y;

}
void display (){
   System.out.println("corrinates:( "+ x +" ,"+ y +")");
}

public static void main(String[] args){
    Point p1 = new Point() ;
      p1.display() ;
    Scanner sc = new Scanner(System.in) ;
     int x = sc.nextInt() ;
      int y = sc.nextInt() ;
     Point p2 = new Point(x,y) ;
       p2.display() ;
      Point p3 = new Point(p2) ;
       p3.display() ;
}

}

