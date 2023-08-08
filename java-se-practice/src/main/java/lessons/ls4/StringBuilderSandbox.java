package lessons.ls4;

public class StringBuilderSandbox {
    public static void main(String[] args){
        /*
            String object to be mutable
         */
        StringBuilder sb = new StringBuilder();
        sb.append("<root>").append("<node1>").append("value").append("</node1>").append("</root>");
        /*
        Example of the same thing as above
        String simpleXml = "";
        simpleXml = simpleXml + "<root>";
        simpleXml = simpleXml + "<node1>";
        simpleXml = simpleXml + "value";
        simpleXml = simpleXml + "</node1>";
        simpleXml = simpleXml + "</root>";
        */
        String greeting = "Hello";
        StringBuilder mail = new StringBuilder(greeting);
        mail.append(" Joe, ");
        System.out.println(mail.toString());
        System.out.println(mail.length());
        System.out.println(mail.reverse());
        System.out.println(mail);
        /*
            Mutable string
         */
        /*
            Replace at specific place
         */
        mail.setCharAt(10,'?');
        System.out.println(mail);

    }
}
