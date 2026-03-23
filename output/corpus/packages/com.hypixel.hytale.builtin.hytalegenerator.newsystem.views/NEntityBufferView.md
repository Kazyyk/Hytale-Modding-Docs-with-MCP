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
