# BlockMaskCondition

Type: class | Package: com.hypixel.hytale.server.worldgen.util.condition

public class BlockMaskCondition

Condition evaluating BlockMask criteria.

## Constants

- public static final BlockMaskCondition.Mask DEFAULT_MASK
- public static final BlockMaskCondition DEFAULT_TRUE
- public static final BlockMaskCondition DEFAULT_FALSE

## Fields

- @Nonnull private BlockMaskCondition.Mask defaultMask
- @Nonnull private Long2ObjectMap<BlockMaskCondition.Mask> specificMasks

## Methods

- public void set(@Nonnull BlockMaskCondition.Mask defaultMask, @Nonnull Long2ObjectMap<BlockMaskCondition.Mask> specificMasks)
- public boolean eval(int currentBlock, int currentFluid, int nextBlockId, int nextFluidId)
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()

Also in this package: FilteredBlockFluidCondition, HashSetBlockFluidCondition, HashSetIntCondition, IntConditionBuilder, Mask, MaskEntry, RandomCoordinateCondition

Complete API:
  public void set(BlockMaskCondition.Mask defaultMask, Long2ObjectMap<BlockMaskCondition.Mask> specificMasks)
  public boolean eval(int currentBlock, int currentFluid, int nextBlockId, int nextFluidId)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final BlockMaskCondition.Mask DEFAULT_MASK
public static final BlockMaskCondition DEFAULT_TRUE
public static final BlockMaskCondition DEFAULT_FALSE
private BlockMaskCondition.Mask defaultMask
private Long2ObjectMap<BlockMaskCondition.Mask> specificMasks
