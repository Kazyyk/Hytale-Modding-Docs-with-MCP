# BufferBundle

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle | Implements: MemInstrument

public class BufferBundle implements MemInstrument

Container that manages a collection of typed buffer grids for the world generation engine. Each grid is keyed by a `BufferType` and stores `Buffer` instances organized spatially in a 3D grid. Implements `MemInstrument` to report aggregate memory usage across all grids.

## Inner Types

- BufferBundle.Access | class | Provides bounded access into a grid's buffers
- BufferBundle.Grid | class | Spatial grid of tracked buffers with LRU column eviction
- BufferBundle.MemoryReport | class | Formatted memory usage report across all grids
- BufferBundle.Tracker | class | Tracks generation stage index for cache validity

## Fields

- @Nonnull private final Map<BufferType, BufferBundle.Grid> grids

## Methods

- @Nonnull public BufferBundle.Grid createGrid(@Nonnull BufferType bufferType, int capacity)
- @Nonnull public BufferBundle.Access createBufferAccess(@Nonnull BufferType bufferType, @Nonnull Bounds3i bounds_bufferGrid)
- public void closeALlAccesses()
- @Nonnull public BufferBundle.Grid getGrid(@Nonnull BufferType contentType)
- @Nonnull @Override public MemInstrument.Report getMemoryUsage()
- private boolean existingGridHasBufferTypeIndex(int bufferTypeIndex)
- @Nonnull public BufferBundle.MemoryReport createMemoryReport()
