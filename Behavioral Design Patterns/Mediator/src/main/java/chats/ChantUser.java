package chats;

import interfaces.IChatMediator;
import model.User;

public class ChantUser extends User {


    public ChantUser(IChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name+" send in group"+this.chatMediator+"message: "+message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiverMessage(String message) {
        System.out.println(this.name+" received message from "+message);
    }

    public void privateMessage(String message, String receiverName){
        chatMediator.sendPrivateMessage(message, this, receiverName);
    }
}
