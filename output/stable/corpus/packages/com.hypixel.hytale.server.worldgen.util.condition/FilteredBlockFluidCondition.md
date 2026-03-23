# FilteredBlockFluidCondition

Type: class | Package: com.hypixel.hytale.server.worldgen.util.condition | Implements: IBlockFluidCondition

public class FilteredBlockFluidCondition implements IBlockFluidCondition

Condition evaluating FilteredBlockFluid criteria.

## Fields

- private final IBlockFluidCondition filter
- private final IBlockFluidCondition condition

## Methods

- public FilteredBlockFluidCondition(int blockId, IBlockFluidCondition condition)
- public FilteredBlockFluidCondition(IBlockFluidCondition filter, IBlockFluidCondition condition)
- @Override public boolean eval(int block, int fluid)
- @Nonnull @Override public String toString()

Also in this package: BlockMaskCondition, HashSetBlockFluidCondition, HashSetIntCondition, IntConditionBuilder, Mask, MaskEntry, RandomCoordinateCondition

Complete API:
  public boolean eval(int block, int fluid)
  public String toString()

Fields:
private final IBlockFluidCondition filter
private final IBlockFluidCondition condition
