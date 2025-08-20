package singleton;

public class ConnectionPool {
    private static volatile ConnectionPool instance;
    private final String dbCon;

    private ConnectionPool(String dbCon)
    {
        this.dbCon = dbCon;
    }

    public static ConnectionPool getInstance(String dbCon)
    {
        ConnectionPool result = instance;
        if(result!=null){
            return result;
        }

        synchronized (ConnectionPool.class){
            if(instance==null){
                instance = new ConnectionPool(dbCon);
            }
            return instance;
        }
    }

    public void connection(){
        Logger log  = new Logger();
        log.log("Try to connect db for connection "+dbCon);
        System.out.println("Connected to database at " + dbCon);
    }
}
