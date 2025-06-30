import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    public static void main(String[] args) {
//
//        How to Write to a file using Java(4 Popular Options)

        String filePath = "\\\\wsl.localhost\\Ubuntu-24.04\\home\\macmun";
        String textContent = "I like Chicken!\n It's really good \n Buy me Chicken!";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");

        } catch (FileNotFoundException e) {
            System.out.println("Could not locate File Location");

        } catch (IOException e) {
            System.out.println("Could not write File");

        }
    }
}
