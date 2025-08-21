package analytics;

import java.util.HashMap;
import java.util.Map;

/**
 * Legacy service that provides data in an old format.
 */
public class LegacyAnalytics {
    public Map<String, Integer> getCustomerDataAsMap() {
        System.out.println("LegacyAnalytics is generating a report...");
        // In a real project, this would involve complex logic,
        // such as reading from a database, etc.
        Map<String, Integer> data = new HashMap<>();
        data.put("John Doe", 1500);
        data.put("Jane Smith", 2200);
        return data;
    }
}