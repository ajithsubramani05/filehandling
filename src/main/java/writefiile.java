import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writefiile
{
    static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("myfile.txt");
        Writer.nullWriter();

            System.out.println("Successfully written");
        }
        catch (IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }


    }
}
