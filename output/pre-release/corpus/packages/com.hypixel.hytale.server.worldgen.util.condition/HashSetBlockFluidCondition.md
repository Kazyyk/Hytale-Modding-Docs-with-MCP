# HashSetBlockFluidCondition

Type: class | Package: com.hypixel.hytale.server.worldgen.util.condition | Implements: IBlockFluidCondition

public class HashSetBlockFluidCondition implements IBlockFluidCondition

Condition evaluating HashSetBlockFluid criteria.

## Fields

- protected final LongSet set

## Methods

- public HashSetBlockFluidCondition(LongSet set)
- public LongSet getSet()
- @Override public boolean eval(int block, int fluid)
- @Nonnull @Override public String toString()

Also in this package: BlockMaskCondition, FilteredBlockFluidCondition, HashSetIntCondition, IntConditionBuilder, Mask, MaskEntry, RandomCoordinateCondition

Complete API:
  public LongSet getSet()
  public boolean eval(int block, int fluid)
  public String toString()

Fields:
protected final LongSet set
