# BufferBundle.MemoryReport

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle

public static class BufferBundle.MemoryReport

Collects per-grid memory usage entries and formats them into a human-readable report. Grid entries are sorted by buffer type index when converting to string. Reports total memory in megabytes across all grids.

## Inner Types

- BufferBundle.MemoryReport.GridEntry | record | Per-grid memory and count snapshot

## Fields

- @Nonnull public final List<BufferBundle.MemoryReport.GridEntry> gridEntries

## Methods

- @Nonnull @Override public String toString()
