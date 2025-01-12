public class TryCatchBlockExample {

    public static void main(String[] args) {

        String word = "Arumugam";
        try{
            int num = Integer.parseInt(word);
            System.out.println(num);
        }

        catch (Exception e){
            System.out.println("String cannot be converted to int as the error is " + e);
        }

    }
}
