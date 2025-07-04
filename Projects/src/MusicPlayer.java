import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MusicPlayer {

    public static void main(String[] args) {

//        How to Play Audio with Java(.wav .au .aiff)

        String filePath = "//wsl.localhost/Ubuntu-24.04/home/macmun/Dev/Java/Projects/resources/Long Distance - Mark Karan, Scott Guberman, Angeline Saris, Jeremy Hoenig.wav";
        File file = new File(filePath);

        System.out.println("Working Directory: " + System.getProperty("user.dir"));

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("No Problemo! ");
        } catch (FileNotFoundException e) {
            System.out.println("Could Not Locate File!!");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio File is not Supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to Access Audio Resource!");
        } catch (IOException e) {
            System.out.println("Something Went Wrong!!");
        } finally {
            System.out.println("Bye!");
        }
    }
}
