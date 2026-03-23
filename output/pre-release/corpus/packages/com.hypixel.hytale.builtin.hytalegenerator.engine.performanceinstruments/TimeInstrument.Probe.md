# TimeInstrument.Probe

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments

public static class TimeInstrument.Probe

A named nanosecond timer that supports hierarchical child probes. Measures elapsed time between `start()` and `stop()` calls. Child probes are created via `createProbe`. Compatible probes (same name and child structure) can be added together for aggregation across multiple samples.

## Inner Types

- TimeInstrument.Probe.State | enum | Probe lifecycle state

## Fields

- @Nonnull private final String name
- private long startTime
- private long totalTime_ns
- private TimeInstrument.Probe.State state
- private List<TimeInstrument.Probe> probes

## Constructors

- public Probe(@Nonnull String name)

## Methods

- @Nonnull public TimeInstrument.Probe start()
- @Nonnull public TimeInstrument.Probe stop()
- public long getTotalTime_ns()
- @Nonnull public String getName()
- @Nonnull public List<TimeInstrument.Probe> getProbes()
- @Nonnull public TimeInstrument.Probe createProbe(@Nonnull String name)
- public boolean isCompatibleForAddition(@Nonnull TimeInstrument.Probe other)
- public void add(@Nonnull TimeInstrument.Probe probe)
