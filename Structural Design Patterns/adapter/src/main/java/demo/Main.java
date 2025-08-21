package demo;

import analytics.AnalyticsAdapter;
import analytics.LegacyAnalytics;
import interfases.IReportingService;

public class Main {
    public static void main(String[] args) {
        // Create the legacy service (which we can't use directly)
        LegacyAnalytics legacyAnalytics = new LegacyAnalytics();

        // Create an adapter that "wraps" the legacy service
        IReportingService adapter = new AnalyticsAdapter(legacyAnalytics);

        // Now our new system (client) can use the adapted service
        // It calls the method it expects, and the adapter "under the hood"
        // does all the dirty work of transformation.
        System.out.println("--- Client code is requesting a report... ---");
        String report = adapter.generateReport();
        System.out.println("\n--- Received adapted report ---");
        System.out.println(report);
    }
}