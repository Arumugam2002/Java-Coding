public class TryCatchBlockExample {

    public static void main(String[] args) {

        parseString("20");
    }
        public static void parseString(String numberString)
        {
            try{
                //System.out.println(numberString.length());
                int num = Integer.parseInt(numberString);
                System.out.println(num);
            }

            catch (NumberFormatException | NullPointerException e){
                System.out.println("String cannot be converted to int");
            }

            catch (Exception e)
            {
                System.out.println(e);
            }

            finally {
                System.out.println("This statement will be printed whenever the code is being compiled");
            }
        }



}
