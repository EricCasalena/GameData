public class BestSellingGames {
    int rank;
    String title;
    long sales;
    String series;
    String genre;
    String mode;
    String platform;
    String release;
    String developer;
    String publisher;

    void describe() {
        System.out.println(" The game is called " + title + ". It ranked number " + rank + " and came out " + release + "." + " The company who made " + title + " are called "+ developer);
    }
}
