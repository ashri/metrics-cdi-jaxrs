package me.ashri.experiments.metrics;

import java.util.concurrent.TimeUnit;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.codahale.metrics.ConsoleReporter;
import com.codahale.metrics.MetricRegistry;
import io.astefanutti.metrics.cdi.MetricsConfiguration;

@ApplicationPath("")
public class ApplicationConfiguration extends Application {

//    @Produces
//    @ApplicationScoped
//    public MetricRegistry metricRegistry() {
//        MetricRegistry metricRegistry = new MetricRegistry();
//        ConsoleReporter reporter = ConsoleReporter.forRegistry(metricRegistry).build();
//        reporter.start(10, TimeUnit.SECONDS);
//        return metricRegistry;
//    }

    @Inject
    MetricRegistry metricRegistry;

    public void startMetricsReporter(@Observes MetricsConfiguration metricsConfiguration) {
        ConsoleReporter reporter = ConsoleReporter.forRegistry(metricRegistry).build();
        reporter.start(10, TimeUnit.SECONDS);
    }
}
