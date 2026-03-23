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

Also in this package: Cave, CaveBiomeMaskFlags, CaveBlockPriorityModifier, CaveGenerator, CaveNodeChildEntry, CaveNodeCoverEntry, CaveNodeCoverType, CaveNodeType, CavePrefabPlacement, CaveYawMode, Defaults, Entry, FluidLevel, OrientationModifier, PrefabPlacementFunction

Complete API:
  public String getName()
  public CaveNodeType getEntryNode()
  public int getModifiedStartHeight(int seed, int x, int y, int z, Random random)
  public float getStartPitch(Random random)
  public float getStartYaw(Random random)
  public int getStartDepth(Random random)
  public float getHeightRadiusFactor(int seed, double x, double z, int y)
  public ICoordinateCondition getHeightCondition()
  public IPointGenerator getEntryPointGenerator()
  public Int2FlagsCondition getBiomeMask()
  public BlockMaskCondition getBlockMask()
  public CaveType.FluidLevel getFluidLevel()
  public int getEnvironment()
  public boolean isSurfaceLimited()
  public boolean isSubmerge()
  public boolean isEntryThreshold(int seed, int x, int z)
  public boolean isHeightThreshold(int seed, int x, int y, int z)
  public double getMaximumSize()
  private int _hashCode()
  public int hashCode()
  public String toString()

Fields:
protected final String name
protected final CaveNodeType entryNodeType
protected final IFloatRange yaw
protected final IFloatRange pitch
protected final IFloatRange depth
protected final IHeightThresholdInterpreter heightFactors
protected final IPointGenerator pointGenerator
protected final Int2FlagsCondition biomeMask
protected final BlockMaskCondition blockMask
protected final ICoordinateCondition mapCondition
protected final ICoordinateCondition heightCondition
protected final IDoubleRange fixedEntryHeight
protected final NoiseProperty fixedEntryHeightNoise
protected final CaveType.FluidLevel fluidLevel
protected final int environment
protected final boolean surfaceLimited
protected final boolean submerge
protected final double maximumSize
protected final int hashCode
