package singleton;

public final class Logger {
    private static volatile Logger instance;

    public static Logger getInstance()
    {
        Logger result = instance;
        if(result!=null){
            return  result;
        }

        synchronized (Logger.class){
            if(instance==null){
                instance = new Logger();
            }
            return instance;
        }
    }

    public void log(String message){
        System.out.println("[message] "+message);
    }

}
