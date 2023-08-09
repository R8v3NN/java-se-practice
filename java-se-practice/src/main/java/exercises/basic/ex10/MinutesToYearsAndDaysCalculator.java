package exercises.basic.ex10;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args){
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    private static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int days = (int)(minutes/1440);
            int year = 0;
            while(days >= 365){
                year += 1;
                days = days - 365;
            }
            System.out.println(minutes + " min = " + year + " y and " + days + " d");
        }
    }
}
