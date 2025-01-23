import java.io.*;

public class BufferedWriterExample {

    public static void main(String[] args) throws IOException {


        try(BufferedWriter writeFile = new BufferedWriter(new FileWriter("file.txt"))){


            writeFile.write("Hello Everyone,");
            writeFile.newLine();
            writeFile.write("Myself, Arumugam Pandaram.");
            writeFile.newLine();
            writeFile.write("I am currently Final Year Student at GEC Modasa pursuing B.E in Information Technology.");
        }
        catch (IOException e) {
            System.out.println(e);
        }

        try(BufferedReader readFile =  new BufferedReader(new FileReader("file.txt"));){

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
