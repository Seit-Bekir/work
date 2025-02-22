package BeginCurs.day13;

import java.util.Date;

public class Messege {
    private User sender;
    private  User reciver;
    private String text;
    private Date data;

    public Messege(User sender, User reciver, String text) {
        this.sender = sender;
        this.reciver = reciver;
        this.text = text;
        data = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReciver() {
        return reciver;
    }

    public String getText() {
        return text;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "FROM: "+getSender()+"\nTo: "+getReciver()+"\n text: "+getText()+"\ndate: "+getData()+"\n";
    }
}
