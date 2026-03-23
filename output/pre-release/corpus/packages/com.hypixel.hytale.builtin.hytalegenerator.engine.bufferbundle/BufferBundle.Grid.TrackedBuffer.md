# BufferBundle.Grid.TrackedBuffer

Type: record | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle | Implements: MemInstrument

public record BufferBundle.Grid.TrackedBuffer(@Nonnull BufferBundle.Tracker tracker, @Nonnull Buffer buffer) implements MemInstrument

Pairs a `Buffer` with a BufferBundle.Tracker. Reports combined memory usage of both the tracker and the buffer.

## Components

- @Nonnull BufferBundle.Tracker tracker
- @Nonnull Buffer buffer

## Methods

- @Nonnull @Override public MemInstrument.Report getMemoryUsage()

Also in this package: Access, BufferBundle, Grid, GridEntry, MemoryReport, Tracker, View

Complete API:
  public MemInstrument.Report getMemoryUsage()
