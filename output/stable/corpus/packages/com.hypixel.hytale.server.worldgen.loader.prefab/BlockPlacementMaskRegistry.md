# BlockPlacementMaskRegistry

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.prefab | Extends: FileMaskCache

public class BlockPlacementMaskRegistry extends FileMaskCache<BlockMaskCondition>

Extends `FileMaskCache`.

## Fields

- private BlockMaskCondition tempMask
- private BlockMaskCondition.MaskEntry tempEntry

## Methods

- @Nonnull public BlockMaskCondition retainOrAllocateMask(@Nonnull BlockMaskCondition.Mask defaultMask, @Nonnull Long2ObjectMap<BlockMaskCondition.Mask> specificMasks)
- @Nonnull public BlockMaskCondition.MaskEntry retainOrAllocateEntry(@Nonnull ResolvedBlockArray blocks, boolean replace)
