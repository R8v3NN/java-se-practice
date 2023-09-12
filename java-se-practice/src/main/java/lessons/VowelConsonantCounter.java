package lessons;

public class VowelConsonantCounter {
    public static void main(String[] args){
        String word = "Arrays";
        int[] result = NumberOfVowelsAndConsonants(word);
        System.out.println(String.format("Number of vowels is %s and consonants is %s in '%s'"
                , result[0], result[1], word));
    }

    private static int[] NumberOfVowelsAndConsonants(String word) {
        int vowelsCount = 0;
        String vowels = "aiuey";
        for( int i = 0; i < word.length(); i++){
            if(vowels.contains(String.valueOf(word.toLowerCase().charAt(i)))){
                vowelsCount++;
            }
        }
        return new int[] {vowelsCount, word.length() - vowelsCount};
    }
}
