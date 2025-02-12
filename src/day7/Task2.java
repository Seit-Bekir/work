package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(50);
        Player player2 = new Player(50);
        Player player3 = new Player(50);
        Player player4 = new Player(50);
        Player player5 = new Player(50);

        Player player = new Player(91);

        for (int i = 0; i < 92; i++) {
            player.run();
        }


        Player.info();
        System.out.println(Player.getCountPlayers());


    }
}
