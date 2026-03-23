# BufferBundle.MemoryReport.GridEntry

Type: record | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle

public record BufferBundle.MemoryReport.GridEntry(MemInstrument.Report report, int bufferCount, @Nonnull BufferType bufferType)

Captures a snapshot of a single grid's memory usage, buffer count, and buffer type for inclusion in a BufferBundle.MemoryReport.

## Components

- MemInstrument.Report report
- int bufferCount
- @Nonnull BufferType bufferType

## Methods

- @Nonnull public String toString(int indentation)

Also in this package: Access, BufferBundle, Grid, MemoryReport, TrackedBuffer, Tracker, View

Complete API:
  public String toString(int indentation)
