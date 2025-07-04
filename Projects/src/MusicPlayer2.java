import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MusicPlayer2 {

    public static void main(String[] args) {

//        How to Play Audio with Java(.wav .au .aiff)

        String filePath = "\\\\wsl.localhost\\Ubuntu-24.04\\home\\macmun\\Dev\\Java\\Projects\\src\\Long Distance - Mark Karan, Scott Guberman, Angeline Saris, Jeremy Hoenig.wav";
        File file = new File(filePath);

        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("No Problemo! Playing audio...");

            // Actually start playing the audio
            clip.start();

            // Wait for the clip to finish playing
            while (clip.getMicrosecondLength() != clip.getMicrosecondPosition()) {
                Thread.sleep(100); // Check every 100ms
            }

            // Clean up resources
            clip.close();
            audioStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("Could Not Locate File!!");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio File is not Supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to Access Audio Resource!");
        } catch (IOException e) {
            System.out.println("Something Went Wrong!!");
        } catch (InterruptedException e) {
            System.out.println("Playback was interrupted!");
        } finally {
            System.out.println("Bye!");
        }
    }
}