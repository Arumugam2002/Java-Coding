import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {

    public static void main(String[] args) throws IOException {



        try(BufferedReader readFile =  new BufferedReader(new FileReader("story.txt"));){

            String line;

            while((line = readFile.readLine())!=null)
            {
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error " + e);
        }


    }
}
