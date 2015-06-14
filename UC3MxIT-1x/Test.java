public class Test {
public static void main(String[] args) {
   Point p1 = new Point(9,7);
   Point p2 = new Point(3,2);
   Line l1  = new Line(p1,p2);
   double len  = l1.length();
   System.out.println(len);
   
}
}
