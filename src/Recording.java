public class Recording {
    private String title;
    private String artist;
    private int playingTime; // in seconds

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPlayingTime() {
        return playingTime;
    }
}
