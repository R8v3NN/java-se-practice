package exercises.intermediate;

public class Point {
    private int x;
    private int y;
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
    public Point(){

    }
    private Point(int x, int y) {
        setX(x);
        setY(y);
    }
    private int getX(){
        return x;
    }
    private int getY(){
        return y;
    }
    private void setX(int x){
        this.x=x;
    }
    private void setY(int y){
        this.y=y;
    }
    private double distance(){
        return Math.sqrt(x*x + y*y);
    }
    private double distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
    }
    private double distance(Point point){
        return Math.sqrt((point.x-this.x)*(point.x-this.x) +
                (point.y-this.y)*(point.y-this.y));
    }
}
