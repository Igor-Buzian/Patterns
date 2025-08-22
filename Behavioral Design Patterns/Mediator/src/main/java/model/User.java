package model;


import interfaces.IChatMediator;

public abstract class User {
    protected IChatMediator chatMediator;
    protected String name;

    public User(IChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);

    public abstract void receiverMessage(String message);

    public String getName() {
        return name;
    }
}
