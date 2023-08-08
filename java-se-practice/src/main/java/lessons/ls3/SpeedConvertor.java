package lessons.ls3;

public class SpeedConvertor {
    public static void main(String[] args){
        System.out.println(toMilesPerHour(1.5) == 1);
        System.out.println(toMilesPerHour(10.25) == 6);
        System.out.println(toMilesPerHour(-5.6) == 1);
        System.out.println(convertedSpeedMessage(1.5).equals("1.5 km/h = 1 mi/h"));
        System.out.println(convertedSpeedMessage(25.42).equals("25.42 km/h = 16 mi/h"));
        System.out.println(convertedSpeedMessage(-7.89).equals("Invalid value"));
        //convertSpeed(1.5);
        //convertSpeed(25.42);
        //convertSpeed(-7.89);
    }

    private static String convertedSpeedMessage(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        if(miles < 0){
            return "Invalid value";
        }
        return kilometersPerHour + " km/h = " + miles + " mi/h";
    }
    private static void convertSpeed(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        if(miles < 0){
            System.out.println("Invalid value");
            return;
        }
        System.out.println("" + kilometersPerHour + " km/h = " + miles + " mi/h");
    }
    private static long toMilesPerHour(double kilometersPerHour){
        double conversionCoefficient = 1.609;
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / conversionCoefficient);
    }
}
