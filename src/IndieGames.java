public class IndieGames extends Games {
    String title;
    String sales;
    String release;
    String developer;
    String publisher;

    void describe() {
        System.out.println(" This game is called " + title + " The game released in " + release + " The game sold " + sales + " It is developed by " + developer + " it is published by " + publisher);
    }
}

