# TimeInstrument

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments

public class TimeInstrument

Aggregates timing samples from hierarchical probes across multiple chunk generation runs. Each `takeSample` call adds probe timings to a running total. The `toString` method produces a formatted performance report showing average time per sample for each probe and its children, in milliseconds.

## Inner Types

- TimeInstrument.Probe | class | Hierarchical nanosecond timer with child probes

## Fields

- private int sampleCount
- @Nonnull private TimeInstrument.Probe totalProbe
- private String header

## Constructors

- public TimeInstrument(@Nonnull String header)

## Methods

- public void takeSample(@Nonnull TimeInstrument.Probe probe)
- @Nonnull @Override public String toString()
- @Nonnull private String toString(int indentation, @Nonnull TimeInstrument.Probe probe)

Also in this package: MemInstrument, Probe, Report, State

Complete API:
  public void takeSample(TimeInstrument.Probe probe)
  public String toString()
  private String toString(int indentation, TimeInstrument.Probe probe)

Fields:
private int sampleCount
private TimeInstrument.Probe totalProbe
private String header
