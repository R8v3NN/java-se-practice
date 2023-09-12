package exercises.intermediate;

public class FlourPackProblem {
    public static void main(String[] args){
        System.out.println(canPack(1, 0, 4));//false
        System.out.println(canPack(1, 0, 5));//true
        System.out.println(canPack(0, 5, 4));//true
        System.out.println(canPack(2, 2, 11));//true
        System.out.println(canPack(-3, 2, 12));//false
    }
    private static boolean canPack(int bigCount, int smallCount, int goal){
        int ValueOfBigCount = bigCount * 5;
        int SumOfCounts = ValueOfBigCount + smallCount;
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        else {
            if(SumOfCounts == goal){
                return true;
            }
            else if(SumOfCounts > goal){
                if(ValueOfBigCount < goal){
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
    }
}
