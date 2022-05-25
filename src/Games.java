import java.util.ArrayList;

public class Games {
    static private ArrayList<Games> allMyGames;
   private String title;
   private String release;
   private String developer ;
   private String publisher;
   private String platform;

    //Constructor

    public Games(String title, String release, String developer, String publisher, String platform) {
        this.title = title;
        this.release = release;
        this.developer = developer;
        this.publisher = publisher;
        if (allMyGames == null) {
            allMyGames = new ArrayList<Games>();
        }
        allMyGames.add(this);
    }

    //Getters and Setters


    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected String getRelease() {
        return release;
    }

    protected void setRelease(String release) {
        this.release = release;
    }

    protected String getDeveloper() {
        return developer;
    }

    protected void setDeveloper(String developer) {
        this.developer = developer;
    }

    protected String getPublisher() {
        return publisher;
    }

    protected void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    protected String getPlatform() {
        return platform;
    }

    protected void setPlatform(String platform) {
        this.platform = platform;

    }

    static void describeALL() {
        System.out.println(allMyGames);
    }
}