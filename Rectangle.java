class Rectangle{
     double w ;
  double h ;
Rectangle(){
     w= 1;
     h =1 ;

}

Rectangle(double width,double height){
   w = width ; 
    h = height ;

}
void  getArea(){
// return  (w*h) ;
System.out.println("Area  Of Rectangle"+( w*h)) ;

}
 void  getPerimeter(){
 System.out.println("perimeter of Rectangle "+ (2*(w + h) ))  ;
}
public static void main(String[]args){
	
	Rectangle obj1 = new Rectangle() ;
	  obj1.getArea() ;
          obj1.getPerimeter() ;

	Rectangle obj2 = new Rectangle(5,10) ;
	  obj2.getArea() ;
          obj2.getPerimeter() ;

}
}
