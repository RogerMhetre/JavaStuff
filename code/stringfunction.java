public class stringfunction {
    public static void main(String[] args) {

        String name = "Juice WRLD";

        // int length = name.length(); //length of the variable
        // char letter = name.charAt(0); //First character of the variable
        // int index = name.indexOf(" "); //this gives you the first interference of the term
        // int lastIndex = name.lastIndexOf(" "); // this gives you the last interference of the term
        //
        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim(); // removes the whitespaces
        // name = name.replace("e", "y");

        /*
           if (name.isEmpty()){
           System.out.println("The nmae is empty");
           }
           else {
           System.out.println("Hello " + name);
           }


        if (name.contains(" ")) {
            System.out.println("Your name contains a space");
        }
        else {
            System.out.println("Your name does not contain a space");
        }
        */

        if(name.equals("password")){
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("hello " + name);
        }

    }
}
