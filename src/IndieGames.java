public class IndieGames extends Games {
   private String sales;

   //Constructor

    public IndieGames(String title, String release, String developer, String publisher, String platform, String sales) {
        super(title, release, developer, publisher, platform);
        this.sales = sales;
    }


    //Getter and Setters

    protected String getSales() {
        return sales;
    }

    protected void setSales(String sales) {
        this.sales = sales;
    }

    public String toString() {
        return " This game is called " + getTitle() + " The game released in " + getRelease() + " The game sold " + sales + " It is developed by " + getDeveloper() + " it is published by " + getPublisher();
    }
}

