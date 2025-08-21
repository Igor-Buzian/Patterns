package analytics;

import interfases.IReportingService;

import java.util.Map;

/**
 * An adapter that allows using the deprecated LegacyAnalytics
 * with the new IReportingService interface.
 */
public class AnalyticsAdapter implements IReportingService {
    private LegacyAnalytics legacyAnalytics;

    public AnalyticsAdapter(LegacyAnalytics legacyAnalytics) {
        this.legacyAnalytics = legacyAnalytics;
    }

    @Override
    public String generateReport() {
        System.out.println("Adapter started. Transforming data...");

        // 1. Use the old service to get the raw data
        Map<String, Integer> rawData = legacyAnalytics.getCustomerDataAsMap();

        // 2. Execute the adaptation logic: convert the Map into a String report.
        StringBuilder reportBuilder = new StringBuilder("Sales Report:\n");
        for (Map.Entry<String, Integer> entry : rawData.entrySet()) {
            reportBuilder.append("- Customer ").append(entry.getKey()).append(": ").append(entry.getValue()).append(" units.\n");
        }

        System.out.println("Transformation complete.");
        return reportBuilder.toString();
    }
}