import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) {

//        How to read a file using Java(3 Popular Options)

//       Buffered Reader + FIle Reader: Best for reading text files line by line


        String filePath = "test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not Locate File!");

        } catch (IOException e) {
            System.out.println("Something Went Wrong!");
        }

    }

}
