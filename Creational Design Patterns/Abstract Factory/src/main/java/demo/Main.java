package demo;

import factory.GUIFactory;
import factory.MacOSFactory;
import factory.WindowsFactory;

public class Main {
   private static Application configureApplication()
   {
       Application app;
       GUIFactory factory;
      String osName = System.getProperty("os.name").toLowerCase();
      if(osName == "mac")
      {
          factory = new MacOSFactory();
      }
      else
      {
          factory = new WindowsFactory();
      }
       app = new Application(factory);
      return app;
   }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();
    }
}
