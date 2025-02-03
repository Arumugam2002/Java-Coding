public class FunctionalInterfaceLambdaExample {

    public static void main(String[] args) {


//        GreetingsImplementation greet1 = new GreetingsImplementation();
//
//        greet1.greetings("Hello Everyone");

        //Lambda used
        Greetings greet1 = (n) -> System.out.println(n);

        greet1.greetings("Hello and Good Evening Everyone");
    }
}

@FunctionalInterface
interface Greetings{
    void greetings(String greet);

}



//class GreetingsImplementation{
//
//    public  void greetings(String greet)
//    {
//        System.out.println(greet);
//    }
//
//}