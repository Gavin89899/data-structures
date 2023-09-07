package Lab1;
import java.util.Scanner;

/**
 *
 * @author Gavin Corley
 */
public class Lab1driver 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the song title: ");
        String songTitleEntered = input.nextLine();

        System.out.print("Enter the artist: ");
        String artistEntered = input.nextLine();

        System.out.print("Enter the length in seconds: ");
        int lengthEntered = input.nextInt();

        Song songResult = new Song(songTitleEntered,
                        artistEntered, 
                 lengthEntered);

        System.out.println("\nYou Entered:\n");
        System.out.println("Song Title: " + songResult.getSongTitle());
        System.out.println("Artist: " + songResult.getArtist());
        System.out.println("Length (seconds): "
                           + songResult.getLengthInSeconds());

        input.close();
    }
}
