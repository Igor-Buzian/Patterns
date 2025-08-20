package demo;

import factory.ButtonFactory;
import factory.HtmlButtonFactory;
import factory.WindowsButtonFactory;

public class Main {
    private static ButtonFactory factory;

    public static void configuration()
    {
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.equals("windows 11"))
        {
            factory = new WindowsButtonFactory();
        }
        else
        {
            factory = new HtmlButtonFactory();
        }
    }
    public static void info(){
        factory.info();
    }
    public static void main(String[] args) {
        configuration();
        info();
    }
}
