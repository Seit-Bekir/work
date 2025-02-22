package BeginCurs.day13;

import java.util.ArrayList;
import java.util.List;

public class MessegeDataBase {
    private static List<Messege> messeges = new ArrayList<>();

    public static void newMessege(User sender, User reciver, String text) {
        messeges.add(new Messege(sender, reciver, text));
    }

    public static void showDialog(User u1, User u2) {
        for (Messege messege : messeges) {
            if (messege.getSender() == u1 && messege.getReciver() == u2 || messege.getSender() == u2 && messege.getReciver() == u1) {
               // System.out.println(messege.getSender()+": "+messege.getText());
                System.out.println(messege);
            }
        }
    }
}



