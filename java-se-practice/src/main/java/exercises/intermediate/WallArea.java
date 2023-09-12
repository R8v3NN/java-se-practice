package exercises.intermediate;

public class WallArea {
    private double width;
    private double height;
    public static void main(String[] args) {
        WallArea wall = new WallArea(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
    private WallArea(double width, double height) {
        setWidth(width);
        setHeight(height);
    }
    private double getWidth(){
        return width;
    }
    private double getHeight(){
        return height;
    }
    private void setWidth(double width){
        if(width < 0){
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }
    private void setHeight(double height){
        if(height < 0){
            this.height = 0;
        }
        else {
            this.height = height;
        }
    }
    private double getArea(){
        return width * height;
    }
}
