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

Also in this package: BlockPlacementMaskJsonLoader, Constants, Constants, Constants, PrefabPatternGeneratorJsonLoader, WeightedPrefabMapJsonLoader

Complete API:
  public BlockMaskCondition retainOrAllocateMask(BlockMaskCondition.Mask defaultMask, Long2ObjectMap<BlockMaskCondition.Mask> specificMasks)
  public BlockMaskCondition.MaskEntry retainOrAllocateEntry(ResolvedBlockArray blocks, boolean replace)

Fields:
private final Map<BlockMaskCondition,BlockMaskCondition> masks
private final Map<BlockMaskCondition.MaskEntry,BlockMaskCondition.MaskEntry> entries
private BlockMaskCondition tempMask
private BlockMaskCondition.MaskEntry tempEntry
