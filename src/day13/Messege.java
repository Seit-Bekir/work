package day13;

import day11.Picker;

import javax.xml.crypto.Data;
import java.util.Calendar;
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
        return "FROM: "+getSender()+" to "+getReciver()+"\n "+getText()+"\ndate: "+getData();
    }
}
