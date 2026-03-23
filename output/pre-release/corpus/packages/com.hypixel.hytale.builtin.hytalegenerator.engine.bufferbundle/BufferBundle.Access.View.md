# BufferBundle.Access.View

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle

public static class BufferBundle.Access.View

A read-only sub-view into a BufferBundle.Access bounded by a subset of the parent access's buffer grid coordinates. Delegates buffer lookups to the parent access while enforcing its own tighter bounds.

## Fields

- @Nonnull private final BufferBundle.Access access
- @Nonnull private final Bounds3i bounds_bufferGrid

## Constructors

- private View(@Nonnull BufferBundle.Access access, @Nonnull Bounds3i bounds_bufferGrid)

## Methods

- @Nonnull public BufferBundle.Grid.TrackedBuffer getBuffer(int x_bufferGrid, int y_bufferGrid, int z_bufferGrid)
- @Nonnull public BufferBundle.Grid.TrackedBuffer getBuffer(@Nonnull Vector3i position_bufferGrid)
- @Nonnull public Bounds3i getBounds_bufferGrid()
