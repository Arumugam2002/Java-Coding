import java.io.*;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

        BufferedReader readFile = null;

        try{

            readFile = new BufferedReader(new FileReader("story.txt"));

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

        finally {
            if(readFile!=null)
            {
                readFile.close();
            }
        }
    }
}
