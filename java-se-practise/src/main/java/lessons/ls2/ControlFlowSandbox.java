package lessons.ls2;
import java.util.Scanner;

public class ControlFlowSandbox{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.next();
        String greeting = "";
        //Test
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
        */
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
        System.out.println(greeting);
    }
}