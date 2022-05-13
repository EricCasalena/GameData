public class Main {
    public static void main(String[] args) {

        System.out.println("This is my game data");

        BestSellingGames game1 = new BestSellingGames("Minecraft","November 18, 2011","Mojang Studios","Xbox Games Studios","Multiplatform",1,238000000l, "Minecraft", "Sandbox, Survival", "Single-player, multiplayer");
        System.out.println(game1);

        System.out.println(" Here is a list of Indie Games! ");

        IndieGames indieGame1  = new IndieGames("Terraria","2011","Re-Logic","Re-Logic, 505 games","Multiplatform","44000000");
        System.out.println(indieGame1);
    }

}


