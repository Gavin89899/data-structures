package Lab1;

/**
 *
 * @author Gavin Corley
 */
public class Song 
{
    // Private instance variables
    private String songTitle;
    private String artist;
    private int lengthInSeconds;

    /**
     * 
     * @param initialSongTitle The title of the song
     * @param initialArtist The name of the artist
     * @param initialLengthInSeconds The length of the song in seconds
     */
    public Song(String initialSongTitle, String initialArtist,
                int initialLengthInSeconds) 
    {
        songTitle = initialSongTitle;
        artist = initialArtist;
        lengthInSeconds = initialLengthInSeconds;
    }
    
    /**
     * 
     * @param newSongTitle Sets the new name of the song
     */
    public void setSongTitle(String newSongTitle) 
    {
        songTitle = newSongTitle;
    }
    
    /**
     * 
     * @param initialArtist Sets the new name of the artist
     */
    public void setArtist(String initialArtist) 
    {
        artist = initialArtist;
    }
    
    /**
     * 
     * @param initialLengthInSeconds Sets the new length of the song
     */
    public void setLengthInSeconds(int initialLengthInSeconds) 
    {
        lengthInSeconds = initialLengthInSeconds;
    }
    
    /**
     * 
     * @return The name of the song
     */
    public String getSongTitle() 
    {
        return songTitle;
    }

    /**
     * 
     * @return The name of the artist
     */
    public String getArtist() 
    {
        return artist;
    }

    /**
     * 
     * @return The length of the song
     */
    public int getLengthInSeconds() 
    {
        return lengthInSeconds;
    }

    
}
