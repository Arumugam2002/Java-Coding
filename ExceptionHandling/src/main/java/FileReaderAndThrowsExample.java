import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderAndThrowsExample {





//        try{
//            FileReader fileReader = new FileReader("file.txt");
//        } catch (Exception e) {
//            System.out.println("Error");
//        }



    public static void main(String[] args) {

       try{
           readerFile();
       }
       catch (FileNotFoundException e)

       {
           System.out.println(e);
       }
    }

    public static void readerFile() throws FileNotFoundException
    {
        FileReader fileReader = new FileReader("file.txt");
    }
}

