# NEntityBufferView

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.views | Implements: EntityContainer

public class NEntityBufferView implements EntityContainer

## Fields

- @Nonnull private final NBufferBundle.Access.View access
- @Nonnull private final Bounds3i bounds_voxelGrid
- @Nonnull private final Bounds3i bounds_bufferGrid

## Constructors

- public NEntityBufferView(@Nonnull NBufferBundle.Access.View bufferAccess)

## Methods

- public void forEach(@Nonnull Consumer<EntityPlacementData> consumer)
- @Nonnull private NEntityBuffer getBuffer_fromBufferGrid(@Nonnull Vector3i position_bufferGrid)
- public void copyFrom(@Nonnull NEntityBufferView source)
- @Override public void addEntity(@Nonnull EntityPlacementData entityPlacementData)
- @Override public boolean isInsideBuffer(int x, int y, int z)

Also in this package: EntityContainer, NPixelBufferView, NVoxelBufferView

Complete API:
  public void forEach(Consumer<EntityPlacementData> consumer)
  private NEntityBuffer getBuffer_fromBufferGrid(Vector3i position_bufferGrid)
  public void copyFrom(NEntityBufferView source)
  public void addEntity(EntityPlacementData entityPlacementData)
  public boolean isInsideBuffer(int x, int y, int z)

Fields:
private final NBufferBundle.Access.View access
private final Bounds3i bounds_voxelGrid
private final Bounds3i bounds_bufferGrid
