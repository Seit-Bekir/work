package BeginCurs.day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("pupkin");
        User user2 = new User("Ivanov");

        user1.sendMesege(user2,"hello user2 it is from user1");
        user2.sendMesege(user1,"Hi user1 I see your messeg senk you");
        MessegeDataBase.showDialog(user1,user2);
    }
}
