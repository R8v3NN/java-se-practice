package lessons;
import java.util.Scanner;

public class ControlFlowSandbox{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.next();
        String greeting = "";
        int numberOfGreets = scanner.nextInt();
        //Konstrukcja IF
        /*
        if(Objects.equals(name, "Maja")){
            greeting = "Czesc, "+name;
        }
        else if(Objects.equals(name, "Chen")){
            greeting = "Nigao, "+name;
        }
        else {
            greetng = "Hello, "+name;
        }

        System.out.println(greeting);
        */

        //Konstrukcja Switch
        switch (name.trim()){
            case "Chen" :
                greeting = "Nihao, "+name;
                break;
            case "Maja" :
                greeting = "Czesc, "+name;
                break;
            default :
                greeting = "Hello, "+name;
        }
        /*
        //Konstrukcja FOR
        for(int i = 0; i < numberOfGreets;i++){
            System.out.println(greeting);
        }
        */
        int i = 0;
        do {
            System.out.println(greeting);
            i++;
        }
        while(i < numberOfGreets);
    }
}