# RandomCoordinateCondition

Type: class | Package: com.hypixel.hytale.server.worldgen.util.condition | Implements: ICoordinateCondition

public class RandomCoordinateCondition implements ICoordinateCondition

Condition evaluating RandomCoordinate criteria.

## Fields

- private final double chance

## Methods

- public RandomCoordinateCondition(double chance)
- @Override public boolean eval(int seed, int x, int y)
- @Override public boolean eval(int seed, int x, int y, int z)
- @Nonnull @Override public String toString()

Also in this package: BlockMaskCondition, FilteredBlockFluidCondition, HashSetBlockFluidCondition, HashSetIntCondition, IntConditionBuilder, Mask, MaskEntry

Complete API:
  public boolean eval(int seed, int x, int y)
  public boolean eval(int seed, int x, int y, int z)
  public String toString()

Fields:
private final double chance
