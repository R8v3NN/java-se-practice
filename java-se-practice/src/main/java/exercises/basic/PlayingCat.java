package exercises.basic;

public class PlayingCat {
    public static void main(String[] args){
        System.out.println(isCatPlaying(true, 10) == false);
        System.out.println(isCatPlaying(false, 36) == false);
        System.out.println(isCatPlaying(false,35) == true);
    }
    private static boolean isCatPlaying(boolean summer, int temperature){
        if(summer == true && temperature >= 25 && temperature <= 45){
            return true;
        }
        else if (summer == false && temperature >= 25 && temperature <= 35) {
            return true;
        }
        else {
            return false;
        }
    }
}
