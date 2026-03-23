# BufferBundle.Access

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle | Implements: MemInstrument

public static class BufferBundle.Access implements MemInstrument

Provides bounded read access into a BufferBundle.Grid. Maintains an array of tracked buffers within specified 3D bounds (buffer grid coordinates). The Y range is always clamped to 0, 40). Once closed, all buffer references are cleared and further access is prohibited.

## Inner Types

- [BufferBundle.Access.View | class | Read-only sub-view into an Access's buffer range

## Fields

- @Nonnull private final BufferBundle.Grid grid
- @Nonnull private final Bounds3i bounds_bufferGrid
- @Nonnull private final BufferBundle.Grid.TrackedBuffer[] buffers
- private boolean isClosed

## Constructors

- private Access(@Nonnull BufferBundle.Grid grid, @Nonnull Bounds3i bounds_bufferGrid)

## Methods

- @Nonnull public BufferBundle.Access.View createView(@Nonnull Bounds3i viewBounds_bufferGrid)
- @Nonnull public BufferBundle.Access.View createView()
- @Nonnull public BufferBundle.Grid.TrackedBuffer getBuffer(int x_bufferGrid, int y_bufferGrid, int z_bufferGrid)
- @Nonnull public BufferBundle.Grid.TrackedBuffer getBuffer(@Nonnull Vector3i position_bufferGrid)
- @Nonnull public Bounds3i getBounds_bufferGrid()
- public void close()
- @Nonnull @Override public MemInstrument.Report getMemoryUsage()
- private void loadGrid()

Also in this package: BufferBundle, Grid, GridEntry, MemoryReport, TrackedBuffer, Tracker, View

Complete API:
  public BufferBundle.Access.View createView(Bounds3i viewBounds_bufferGrid)
  public BufferBundle.Access.View createView()
  public BufferBundle.Grid.TrackedBuffer getBuffer(int x_bufferGrid, int y_bufferGrid, int z_bufferGrid)
  public BufferBundle.Grid.TrackedBuffer getBuffer(Vector3i position_bufferGrid)
  public Bounds3i getBounds_bufferGrid()
  public void close()
  public MemInstrument.Report getMemoryUsage()
  private void loadGrid()

Fields:
private final BufferBundle.Grid grid
private final Bounds3i bounds_bufferGrid
private final BufferBundle.Grid.TrackedBuffer[] buffers
private boolean isClosed
