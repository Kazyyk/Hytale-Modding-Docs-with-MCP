# AverageCollector

Type: class | Package: com.hypixel.hytale.metrics.metric

public class AverageCollector

Provides AverageCollector functionality within the metric subsystem.

## Fields

- private double val
- private long n

## Methods

- public double get()
- public long size()
- public double addAndGet(double v)
- public void add(double v)
- public void remove(double v)
- public void clear()
- public static double add(double val, double v, int n)
- public void set(double v)

Known subclasses: SynchronizedAverageCollector

Also in this package: Builder, HistoricMetric, Metric, SynchronizedAverageCollector

Complete API:
  public double get()
  public long size()
  public double addAndGet(double v)
  public void add(double v)
  public void remove(double v)
  public void clear()
  public static double add(double val, double v, int n)
  public void set(double v)

Fields:
private double val
private long n
