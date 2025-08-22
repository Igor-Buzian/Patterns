package interfaces;

import model.User;

public interface IChatMediator {
    void sendMessage(String message, User sender);
    void sendPrivateMessage(String message, User sender, String receiverName);
}