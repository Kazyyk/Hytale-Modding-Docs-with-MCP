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
