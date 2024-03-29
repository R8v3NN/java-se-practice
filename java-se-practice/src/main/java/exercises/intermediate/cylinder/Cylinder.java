package exercises.intermediate.cylinder;

public class Cylinder extends Circle {
    private double height;

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }

    public Cylinder(double radius, double height) {
        super(radius);
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
}
