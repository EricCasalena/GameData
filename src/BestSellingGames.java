public class BestSellingGames extends Games {
    private int rank;
    private long sales;
    private String series;
    private String genre;
    private String mode;

    //Getter and Setter


    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    void describe() {
        System.out.println(" The game is called " + title + ". It ranked number " + rank + " and came out " + release + "." + " The company who made " + title + " are called " + developer);
    }
}
