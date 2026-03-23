# EntityBuffer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers | Extends: Buffer

public class EntityBuffer extends Buffer

A Buffer that stores a list of `EntityPlacementData` entries for entity spawning during world generation. The entity list is lazily initialized on first `addEntity` call. Supports copy-by-reference from another EntityBuffer via `copyFrom`, setting the `isReference` flag.

## Fields

- @Nullable private List<EntityPlacementData> entities
- private boolean isReference

## Methods

- public void forEach(@Nonnull Consumer<EntityPlacementData> consumer)
- public void addEntity(@Nonnull EntityPlacementData entityPlacementData)
- @Nonnull @Override public MemInstrument.Report getMemoryUsage()
- public void copyFrom(@Nonnull EntityBuffer sourceBuffer)

Also in this package: ArrayContents, ArrayContents, Buffer, CountedArrayContents, CountedPixelBuffer, PixelBuffer, SimplePixelBuffer, State, State, State, VoxelBuffer

Complete API:
  public void forEach(Consumer<EntityPlacementData> consumer)
  public void addEntity(EntityPlacementData entityPlacementData)
  public MemInstrument.Report getMemoryUsage()
  public void copyFrom(EntityBuffer sourceBuffer)

Fields:
private List<EntityPlacementData> entities
private boolean isReference
