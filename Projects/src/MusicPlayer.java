import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MusicPlayer {

    public static void main(String[] args) {

//        How to Play Audio with Java(.wav .au .aiff)

        String filePath = " ";

        File file = new File(filePath);
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
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
