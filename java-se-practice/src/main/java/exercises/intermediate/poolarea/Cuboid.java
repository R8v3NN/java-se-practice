package exercises.intermediate.poolarea;

public class Cuboid extends Rectangle {
    private double height;
    public Cuboid(double width, double length, double height) {
        super(width, length);
        setHeight(height);
    }
    private void setHeight(double height){
        if(height < 0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return this.getArea() * this.height;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
