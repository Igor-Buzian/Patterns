package singleton;

public final class ConfigManager {
    private static volatile ConfigManager instance;
    private final String dbUrl;

    public String getDbUrl() {
        return dbUrl;
    }

    private ConfigManager(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public static ConfigManager getInstance(String value) {
        ConfigManager result = instance;
        if (result != null) {
            return result;
        }

        synchronized (ConfigManager.class) {
            if (instance == null) {
                instance = new ConfigManager(value);
            }
            return instance;
        }
    }
}
