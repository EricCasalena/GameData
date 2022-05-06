public class Main {
    public static void main(String[] args) {

        System.out.println("This is my game data");

        BestSellingGames game1 = new BestSellingGames();
        game1.rank = 1;
        game1.title = "Minecraft";
        game1.sales = 238000000l;
        game1.series = "Minecraft";
        game1.genre = "Sandbox, Survival";
        game1.mode = "Single-player, multiplayer";
        game1.platform = "Multiplatform";
        game1.release = "November 18, 2011";
        game1.developer = "Mojang Studios";
        game1.publisher = "Xbox Games Studios";

        game1.describe();

        System.out.println(" Here is a list of Indie Games! ");

        IndieGames indieGame1  = new IndieGames();
        indieGame1.title = "Terraria";
        indieGame1.sales = "44000000";
        indieGame1.release = "2011";
        indieGame1.developer = "Re-Logic";
        indieGame1.publisher = "Re-Logic, 505 Games";

        indieGame1.describe();
    }
}



