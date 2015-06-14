public class Line {
    private Point p1;
    private Point p2;
    
    public Line (Point firstPoint, Point secondPoint) {
        p1 = firstPoint;
        p2 = secondPoint;
    }
public double length() {
    return Math.sqrt(Math.pow(p2.getX()-p1.getY(),2) 
            + Math.pow(p2.getY()-p1.getX(),2));
}
}
