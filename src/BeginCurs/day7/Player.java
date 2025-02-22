package BeginCurs.day7;

public class Player {
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int  stamina;

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers<6)countPlayers++;
    }

    public void run(){
        if(stamina==0)return;
        stamina--;
        if(stamina==0)
           countPlayers--;
    }

    public static void info(){
        if(countPlayers<6)
            System.out.println("Команда не полная и имеется "+(6-countPlayers)+" свободных мест");
        else {
            System.out.println("Мест больше нет "+(countPlayers)+" Игроков набрано");

        }
    }
}
