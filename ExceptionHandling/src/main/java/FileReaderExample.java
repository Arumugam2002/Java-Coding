import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) throws IOException {


        FileReader fileReader = null;

        try{
            //Connect to a new file
            fileReader = new FileReader("story.txt");

            //-1 means the end of the file
            int character = 0;

            while((character = fileReader.read())!= -1)
            {
                System.out.print((char) character);
            }
        }

        catch(FileNotFoundException e)
        {
            System.out.println("Error " + e);
        }

        finally
        {
            if(fileReader!=null)
            {
                fileReader.close();
            }

        }

    }
}
