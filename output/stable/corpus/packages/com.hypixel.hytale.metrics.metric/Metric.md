# Metric

Type: class | Package: com.hypixel.hytale.metrics.metric

public class Metric

Provides Metric functionality within the metric subsystem.

## Fields

- private long min
- private final AverageCollector average
- private long max

## Methods

- public Metric()
- public void add(long value)
- public void remove(long value)
- public long getMin()
- public double getAverage()
- public long getMax()
- public void clear()
- public void resetMinMax()
- public void calculateMinMax(long value)
- public void addToAverage(long value)
- public void set(@Nonnull Metric metric)
- @Nonnull @Override public String toString()
