# EntityBufferView

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.views | Implements: EntityFunnel

public class EntityBufferView implements EntityFunnel

Provides a voxel-space view over entity buffers within a `BufferBundle.Access.View`. Implements `EntityFunnel` to receive entity placement data, converting voxel-grid positions to buffer-grid positions and adding entities to the appropriate `EntityBuffer`. Also supports iteration over all contained entities via `forEach` and bulk copying from another EntityBufferView.

## Fields

- @Nonnull private final BufferBundle.Access.View access
- @Nonnull private final Bounds3i bounds_voxelGrid
- @Nonnull private final Bounds3i bounds_bufferGrid

## Constructors

- public EntityBufferView(@Nonnull BufferBundle.Access.View bufferAccess)

## Methods

- public void forEach(@Nonnull Consumer<EntityPlacementData> consumer)
- @Nonnull private EntityBuffer getBuffer_fromBufferGrid(@Nonnull Vector3i position_bufferGrid)
- public void copyFrom(@Nonnull EntityBufferView source)
- @Override public void addEntity(@Nonnull EntityPlacementData entityPlacementData)
- @Override public Bounds3i getBounds()

Also in this package: PixelBufferView, VoxelBufferView

Complete API:
  public void forEach(Consumer<EntityPlacementData> consumer)
  private EntityBuffer getBuffer_fromBufferGrid(Vector3i position_bufferGrid)
  public void copyFrom(EntityBufferView source)
  public void addEntity(EntityPlacementData entityPlacementData)
  public Bounds3i getBounds()

Fields:
private final BufferBundle.Access.View access
private final Bounds3i bounds_voxelGrid
private final Bounds3i bounds_bufferGrid
