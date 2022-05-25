import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

    static public void readAllData() {

        {
            try {
                File myObj = new File("IndieGamesDATA");
                Scanner fileReader = new Scanner(myObj);
                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine();
                    Scanner lineReader = new Scanner(line);
                    lineReader.useDelimiter("/t");

                    String title = lineReader.next();
                    System.out.println(title);
                    String sales = lineReader.next();
                    String releaseInfo = lineReader.next();
                    String developer = lineReader.next();
                    String publisher = lineReader.next();

                    Object something = new IndieGames(title, sales, releaseInfo, developer, publisher, sales);
                    System.out.println(something);
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }
        }
    }
}