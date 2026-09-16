public class VideoGames {
    private String VideoGameName;
    private String PlatformName;
    private String CompletedMain;
    private String Comptleted100;
    private int Timeplayed;
    private double Rating;
    private String Review;

    public VideoGames (String VideoGameName, String PlatformName, String CompletedMain, String Comptleted100, int Timeplayed, double Rating, String Review){
        this.VideoGameName = VideoGameName;
        this.PlatformName = PlatformName;
        this.CompletedMain = CompletedMain;
        this.Comptleted100 = Comptleted100;
        this.Timeplayed = Timeplayed;
        this.Rating = Rating;
        this.Review = Review;
    }

    public String getVideoGameName() { 
        return VideoGameName;
    }

    public String getPlatformName() { 
        return PlatformName;
    }

    public String getCompletedMain() { 
        return CompletedMain;
    }

    public String getComptleted100() { 
        return Comptleted100;
    }

    public int getTimeplayed() { 
        return Timeplayed;
    }

    public double getRating() { 
        return Rating;
    }

    public String getReview() { 
        return Review;
    }

    @Override
    public String toString() {
        return "Game: " + VideoGameName + System.lineSeparator()
                + "Platform: " + PlatformName + System.lineSeparator()
                + "Main story completed: " + CompletedMain + System.lineSeparator()
                + "100% completed: " + Comptleted100 + System.lineSeparator()
                + "Hours played: " + Timeplayed + System.lineSeparator()
                + "Rating: " + Rating + System.lineSeparator()
                + "Review: " + Review + System.lineSeparator();
    }
}