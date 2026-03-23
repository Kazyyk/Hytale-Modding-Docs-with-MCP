# NEntityBuffer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers | Extends: NBuffer

public class NEntityBuffer extends NBuffer

A buffer used in the world generation pipeline for storing voxel or pixel data.

## Fields

- @Nullable private List<EntityPlacementData> entities
- private boolean isReference

## Methods

- public void forEach(@Nonnull Consumer<EntityPlacementData> consumer)
- public void addEntity(@Nonnull EntityPlacementData entityPlacementData)
- @Override public MemInstrument.Report getMemoryUsage()
- public void copyFrom(@Nonnull NEntityBuffer sourceBuffer)

Also in this package: ArrayContents, ArrayContents, CountedArrayContents, NBuffer, NCountedPixelBuffer, NPixelBuffer, NSimplePixelBuffer, NVoxelBuffer, State, State, State

Complete API:
  public void forEach(Consumer<EntityPlacementData> consumer)
  public void addEntity(EntityPlacementData entityPlacementData)
  public MemInstrument.Report getMemoryUsage()
  public void copyFrom(NEntityBuffer sourceBuffer)

Fields:
private List<EntityPlacementData> entities
private boolean isReference
