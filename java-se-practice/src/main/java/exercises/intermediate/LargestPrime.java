package exercises.intermediate;

public class LargestPrime {
    public static void main(String[] args){
        System.out.println(getLargestPrime(21)); //7
        System.out.println(getLargestPrime(217)); //31
        System.out.println(getLargestPrime(0)); //-1
        System.out.println(getLargestPrime(45)); //5
        System.out.println(getLargestPrime(-1)); //-1
    }
    private static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i <= number/2; i++){
            if((number%i) == 0){
                return false;
            }
        }
        return true;
    }
    private static int getLargestPrime(int number){
        int biggestPrime = 0;
        if(number < 2){
            return -1;
        }
        else{
            if(number == 2){
                biggestPrime = 2;
            }
            else if(number == 3){
                biggestPrime = 3;
            }
            else {
                for (int i=5; i<=number; i+=2){
                    if(isPrime(i) && number%i == 0){
                        biggestPrime = i;
                    }
                }
            }
            return biggestPrime;
        }
    }
}
