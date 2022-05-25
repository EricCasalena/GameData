import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BestSellingGames extends Games {
    private int rank;
    private long sales;
    private String series;
    private String genre;


    //Constructor

    public BestSellingGames(String title, String release, String developer, String publisher, String platform, int rank, long sales, String series) {
        super(title, release, developer, publisher, platform);
        this.rank = rank;
        this.sales = sales;
        this.series = series;
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


    public String toString() {
        return " The game is called " + getTitle() + ". It ranked number " + rank + " and came out " + getRelease() + "." + " The company who made " + getTitle() + " are called " + getDeveloper();
    }
    static public void readAllData(){
        try{
            File myObj = new File("BestSellingGamesData");
            Scanner fileReader = new Scanner(myObj);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                Scanner lineReader = new Scanner(line);
                lineReader.useDelimiter("\t");

                int rank = lineReader.nextInt();
                String title = lineReader.next();
                System.out.println(title);
                long sales = lineReader.nextLong();
                String series = lineReader.next();
                String platforms = lineReader.next();
                String releaseInfo = lineReader.next();
                String developer = lineReader.next();
                String publisher = lineReader.next();

                Object something = new BestSellingGames(title, releaseInfo, developer, publisher, platforms, rank, sales, series);
                System.out.println(something);
            }
            fileReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
