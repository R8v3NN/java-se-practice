package exercises.basic;

public class AreaCalculator {
    public static void main(String[] args){
        System.out.println(area(5.0) == 78.53982); // W zadaniu bylo 78.53975 a poprawny wynik to 78.53982
        System.out.println(area(-1) == -1);
        System.out.println(rectangleArea(5.0, 4.0) == 20);
        System.out.println(rectangleArea(-1.0, 4.0) == -1);
    }
    private static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        else {
            double ans = (radius*radius)*Math.PI;
            return (double)Math.round(ans*100000d)/100000d;
        }
    }
    private static double rectangleArea(double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        else {
            return x * y;
        }
    }
}
