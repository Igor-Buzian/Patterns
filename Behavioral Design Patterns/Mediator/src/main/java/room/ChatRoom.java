package room;

import interfaces.IChatMediator;
import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatRoom implements IChatMediator {
    private Map<String, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users.values()) {
            if(user!=sender){
                user.receiverMessage(message);
            }
        }
    }

    @Override
    public void sendPrivateMessage(String message, User sender, String receiverName) {
        User currentUser = users.get(receiverName);
        if (currentUser != null) {
            currentUser.receiverMessage("(" + sender.getName() + "): " + message);
        } else {
            System.out.println("this user is not exist!");
        }
    }
}
