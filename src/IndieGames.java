public class IndieGames extends Games {
   private String sales;

   //Getter and Setters


    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    void describe() {
        System.out.println(" This game is called " + title + " The game released in " + release + " The game sold " + sales + " It is developed by " + developer + " it is published by " + publisher);
    }
}

