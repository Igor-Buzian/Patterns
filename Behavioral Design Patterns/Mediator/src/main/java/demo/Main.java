package demo;

import chats.ChantUser;
import room.ChatRoom;

public class Main {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        ChantUser roma = new ChantUser(room, "Roman");
        ChantUser misha = new ChantUser(room, "Michail");
        ChantUser sveta = new ChantUser(room, "Svetlana");

        room.addUser(roma);
        room.addUser(misha);
        room.addUser(sveta);

        roma.sendMessage("Hello world!");
        misha.sendMessage("Hello!");
        sveta.sendMessage("World");
        misha.privateMessage("Private message", "Svetlana");

    }
}
