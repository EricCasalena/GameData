public class BestSellingGames extends Games {
    int rank;
    long sales;
    String series;
    String genre;
    String mode;

    void describe() {
        System.out.println(" The game is called " + title + ". It ranked number " + rank + " and came out " + release + "." + " The company who made " + title + " are called " + developer);
    }
}
