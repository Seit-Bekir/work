package BeginCurs.day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User curentUser : subscriptions) {
            if (curentUser.getUsername().equalsIgnoreCase(user.getUsername())) {
                return true;
            }

        }
        return false;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public boolean isFrend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMesege(User user, String text) {
    MessegeDataBase.newMessege(this,user,text);
    }

    @Override
    public String toString() {
        return  username;
    }
}
