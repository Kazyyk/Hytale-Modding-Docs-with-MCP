# CaveType

Type: class | Package: com.hypixel.hytale.server.worldgen.cave

public class CaveType

Top-level cave configuration defining entry node, orientation ranges, depth, biome/block masks, fluid levels, height conditions, and point generation.

## Constants

- CaveType.FluidLevel EMPTY

## Key Methods

- public String getName()
- public CaveNodeType getEntryNode()
- public int getModifiedStartHeight(int seed, int x, int y, int z, Random random)
- public float getStartPitch(Random random)
- public float getStartYaw(Random random)
- public int getStartDepth(Random random)
- public float getHeightRadiusFactor(int seed, double x, double z, int y)
- public ICoordinateCondition getHeightCondition()
- public IPointGenerator getEntryPointGenerator()
- public Int2FlagsCondition getBiomeMask()
- public BlockMaskCondition getBlockMask()
- public CaveType.FluidLevel getFluidLevel()
- public int getEnvironment()
- public boolean isSurfaceLimited()
- public boolean isSubmerge()
- public boolean isEntryThreshold(int seed, int x, int z)
- public boolean isHeightThreshold(int seed, int x, int y, int z)
- public double getMaximumSize()
- public int hashCode()
- public String toString()
- public BlockFluidEntry getBlockEntry()
- public int getHeight()
