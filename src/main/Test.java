package main;

public class Test {
    public static void main(String[] args) throws Exception {
        Plateau plateau = new Plateau();
        Bot bot = new Bot();

        System.out.println("État initial :");
        System.out.println(plateau);

        String coupBot = bot.jouer(plateau);
        System.out.println("Le bot joue : " + coupBot);

        bot.close();
    }
}
