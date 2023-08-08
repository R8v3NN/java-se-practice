package lessons.ls4;

public class StringSandbox {
    public static void main(String[] args){
        /*
            String examples
         */
        String greeting = "Hello";
        String longText = """
                Long
                Text
                Example
                """;
        int n1 = 5_000_000;
        /*
            String with new Equality check (reference, value)
         */
        String greeting2 = "Czesc";
        String greeting3 = "Hello";
        System.out.println(greeting == greeting3);
        System.out.println(greeting.equals(greeting3));

        User u1 = new User("Joe");
        User u2 = new User("Joe");
        System.out.println(u1.equals(u2));
        System.out.println(u1 == u2);

        greeting = greeting.toUpperCase();
        System.out.println(greeting);
        /*
            Concat strings
         */
        greeting = greeting + u1.getName();
        System.out.println(greeting);
        /*
            Find out string length
         */
        System.out.println("This length of our greeting string is " + greeting.length());
        /*
            View character from string
         */
        for(int i = 0; i < greeting.length(); i++){
            char sym = greeting.charAt(i);
        }
        /*
            Manipulate string case - upper, lower, trim
         */
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());

        String greetWithSpaces = "     Hi     ";
        System.out.println(greetWithSpaces);
        System.out.println(greetWithSpaces.trim());
        /*
            Check if string is empty, blank
         */
        System.out.println(greeting.isBlank());
        System.out.println(greeting.isEmpty());
        /*
            Extract part of the string
         */
        System.out.println(greeting.substring(0,6));
        /*
            Check if string starts/ends with some other string
         */
        System.out.println((greeting.startsWith("H")));
        System.out.println(greeting.endsWith("Joe"));
        System.out.println(greeting.contains("Joe"));
        System.out.println(greeting.equalsIgnoreCase("hello joe"));
        /*
            Replace part of the string
         */
        String newName = "Jane";
        System.out.println(greeting.replace("Joe", newName));
        System.out.println(greeting);
        /*
            String format method - proper output
         */
        //System.out.println("Our greeting '" + greeting + "' after replacing '" + u1.getName() + "' to " + newName + "'");
        //System.out.println(String.format("Our greeting '%s' after replacing '%s' to '%s'", greeting, u1.getName(),newName));
        String phraseWithFormat = "Our greeting '" + greeting + "' after replacing '" + u1.getName() + "' to " + newName + "'";
        String phraseWithPlus = String.format("Our greeting '%s' after replacing '%s' to '%s'", greeting, u1.getName(),newName);
        System.out.println(phraseWithFormat.equals(phraseWithPlus));
    }
}
