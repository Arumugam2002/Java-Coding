public class StringBufferLearning {

    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Arumugam");

        System.out.println(sb.capacity());

        sb.append(" Pandaram ");

        sb.insert(18, "Subramanian");

        System.out.println(sb);
    }



}
