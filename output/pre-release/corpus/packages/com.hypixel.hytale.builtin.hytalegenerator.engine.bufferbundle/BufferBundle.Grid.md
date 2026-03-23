# BufferBundle.Grid

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle | Implements: MemInstrument

public static class BufferBundle.Grid implements MemInstrument

Spatial grid of tracked buffers organized by 3D position in buffer-grid coordinates. Buffers are stored in columns of height 40 (Y range 0, 40)). The grid enforces a configurable capacity and uses an LRU deque to evict the oldest buffer columns when surplus is detected. Columns currently referenced by an active [BufferBundle.Access are protected from eviction.

## Inner Types

- BufferBundle.Grid.TrackedBuffer | record | Pairs a `Buffer` with its `Tracker

## Fields

- @Nonnull private final BufferType bufferType
- @Nonnull private final Map<Vector3i, BufferBundle.Grid.TrackedBuffer> buffers
- @Nonnull private final Deque<Vector3i> oldestColumnEntryDeque_bufferGrid
- private final int capacity
- @Nonnull private final List<BufferBundle.Access> accessors

## Constructors

- private Grid(@Nonnull BufferType bufferType, int capacity)

## Methods

- @Nonnull public BufferType getBufferType()
- @Nonnull public BufferBundle.Access openAccess(@Nonnull Bounds3i bounds_bufferGrid)
- public void closeAllAccesses()
- @Nonnull @Override public MemInstrument.Report getMemoryUsage()
- private void ensureBufferColumnExists(@Nonnull Vector3i position_bufferGrid, @Nonnull BufferBundle.Grid.TrackedBuffer[] trackedBuffersOut)
- private void createBufferColumn(@Nonnull Vector3i position_bufferGrid, @Nonnull BufferBundle.Grid.TrackedBuffer[] trackedBuffersOut)
- private void tryTrimSurplus(int extraRoom)
- private boolean destroyOldestBufferColumn()
- private void removeBufferColumn(@Nonnull Vector3i position_bufferGrid)
- private boolean isBufferColumnInAccess(@Nonnull Vector3i position_bufferGrid)
