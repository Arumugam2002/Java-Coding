public class StringExample {

    public static void main(String[] args)
    {
        String firstName = "Arumugam";
        String lastName = "Pandaram";

        System.out.println(firstName + " " + lastName);

        System.out.println("Length of String is " + firstName.length() + " " + lastName.length());

        System.out.println("UpperCase of String is " + firstName.toUpperCase() + " and Lowercase of String is " + lastName.toLowerCase());

        String combo = firstName + " " + lastName;

        System.out.println("Combo: " + combo);
    }
}
