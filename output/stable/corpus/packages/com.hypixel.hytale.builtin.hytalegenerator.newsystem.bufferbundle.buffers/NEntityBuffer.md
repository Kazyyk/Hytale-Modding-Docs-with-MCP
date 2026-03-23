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
