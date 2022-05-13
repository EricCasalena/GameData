public class BestSellingGames extends Games {
    private int rank;
    private long sales;
    private String series;
    private String genre;
    private String mode;

    //Constructor

    public BestSellingGames(String title, String release, String developer, String publisher, String platform, int rank, long sales, String series, String genre, String mode) {
        super(title, release, developer, publisher, platform);
        this.rank = rank;
        this.sales = sales;
        this.series = series;
        this.genre = genre;
        this.mode = mode;
    }


    //Getter and Setter

    protected int getRank() {
        return rank;
    }

    protected void setRank(int rank) {
        this.rank = rank;
    }

    protected long getSales() {
        return sales;
    }

    protected void setSales(long sales) {
        this.sales = sales;
    }

    protected String getSeries() {
        return series;
    }

    protected void setSeries(String series) {
        this.series = series;
    }

    protected String getGenre() {
        return genre;
    }

    protected void setGenre(String genre) {
        this.genre = genre;
    }

    protected String getMode() {
        return mode;
    }

    protected void setMode(String mode) {
        this.mode = mode;
    }

    public String toString() {
        return " The game is called " + getTitle() + ". It ranked number " + rank + " and came out " + getRelease() + "." + " The company who made " + getTitle() + " are called " + getDeveloper();
    }
}
