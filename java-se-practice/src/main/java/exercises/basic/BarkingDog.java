package exercises.basic;

public class BarkingDog {
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true,1) == true);
        System.out.println(shouldWakeUp(false,2) == false);
        System.out.println(shouldWakeUp(true,8) == false);
        System.out.println(shouldWakeUp(true,-1) == false);
    }
    private static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if( barking == true) {
            if (hourOfDay < 8 && hourOfDay >= 0 || hourOfDay >= 22 && hourOfDay < 24) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
