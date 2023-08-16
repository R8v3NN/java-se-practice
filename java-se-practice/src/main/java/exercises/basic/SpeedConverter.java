package exercises.basic;

public class SpeedConverter {
    public static void main(String[] args){
        /*
        System.out.println(toMilesPerHour(1.5) == 1);
        System.out.println(toMilesPerHour(10.25) == 6);
        System.out.println(toMilesPerHour(-5.6) == -1);
        System.out.println(toMilesPerHour(25.42) == 16);
        System.out.println(toMilesPerHour(75.114) == 47);
        */
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.144);
    }

    private static void printConversion(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        if(miles < 0){
            System.out.println("Invalid value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
    }
    private static long toMilesPerHour(double kilometersPerHour){
        double conversionCoefficient = 1.609;
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / conversionCoefficient);
    }
}
