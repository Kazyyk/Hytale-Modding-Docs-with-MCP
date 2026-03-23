# TimeInstrument

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.performanceinstruments

public class TimeInstrument

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

## Inner Types

- `TimeInstrument.Probe`

Also in this package: MemInstrument, Probe, Report, State

Complete API:
  public void takeSample(TimeInstrument.Probe probe)
  public String toString()
  private String toString(int indentation, TimeInstrument.Probe probe)

Fields:
private int sampleCount
private TimeInstrument.Probe totalProbe
private String header
