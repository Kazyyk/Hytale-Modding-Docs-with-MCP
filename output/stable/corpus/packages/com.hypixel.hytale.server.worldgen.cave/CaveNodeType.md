# CaveNodeType

Type: class | Package: com.hypixel.hytale.server.worldgen.cave

public class CaveNodeType

Defines a type of cave node including its shape generator, fill materials, cover entries, prefab containers, child entries, and priority.

## Constants

- CaveNodeType[] EMPTY_ARRAY
- CaveNodeType.CaveNodeChildEntry[] EMPTY_ARRAY
- CaveNodeType.CaveNodeCoverEntry[] EMPTY_ARRAY
- CaveNodeType.CaveNodeCoverEntry.Entry[] EMPTY_ARRAY

## Key Methods

- public String getName()
- public CavePrefabContainer getPrefabContainer()
- public void setChildren(@Nonnull CaveNodeType.CaveNodeChildEntry[] children)
- public ICoordinateCondition getHeightCondition()
- public IDoubleRange getChildrenCountBounds()
- public BlockFluidEntry getFilling(@Nonnull Random random)
- public CaveNodeShape generateCaveNodeShape(Random random, CaveType caveType, CaveNode parentNode, CaveNodeType.CaveNodeChildEntry childEntry, Vector3d origin, float yaw, float pitch)
- public CaveNodeType.CaveNodeCoverEntry[] getCovers()
- public CaveNodeType.CaveNodeChildEntry[] getChildren()
- public int getPriority()
- public boolean hasEnvironment()
- public int getEnvironment()
- public IWeightedMap<CaveNodeType> getTypes()
- public Vector3d getAnchor()
- public Vector3d getOffset()
- public PrefabRotation getRotation(@Nonnull Random random)
- public IDoubleRange getChildrenLimit()
- public IDoubleRange getRepeat()
- public CaveNodeType.CaveNodeChildEntry.OrientationModifier getPitchModifier()
- public CaveNodeType.CaveNodeChildEntry.OrientationModifier getYawModifier()
- public double getChance()
- public CaveYawMode getYawMode()
- public CaveNodeType.CaveNodeCoverEntry.Entry get(Random random)
- public ICoordinateCondition getMapCondition()
- public ICoordinateCondition getDensityCondition()
- public IBlockFluidCondition getParentCondition()
- public CaveNodeType.CaveNodeCoverType getType()
- public BlockFluidEntry getEntry()
- public String toString()

Also in this package: Cave, CaveBiomeMaskFlags, CaveBlockPriorityModifier, CaveGenerator, CaveNodeChildEntry, CaveNodeCoverEntry, CaveNodeCoverType, CavePrefabPlacement, CaveType, CaveYawMode, Defaults, Entry, FluidLevel, OrientationModifier, PrefabPlacementFunction

Complete API:
  public String getName()
  public CavePrefabContainer getPrefabContainer()
  public void setChildren(CaveNodeType.CaveNodeChildEntry[] children)
  public ICoordinateCondition getHeightCondition()
  public IDoubleRange getChildrenCountBounds()
  public BlockFluidEntry getFilling(Random random)
  public CaveNodeShape generateCaveNodeShape(Random random, CaveType caveType, CaveNode parentNode, CaveNodeType.CaveNodeChildEntry childEntry, Vector3d origin, float yaw, float pitch)
  public CaveNodeType.CaveNodeCoverEntry[] getCovers()
  public CaveNodeType.CaveNodeChildEntry[] getChildren()
  public int getPriority()
  public boolean hasEnvironment()
  public int getEnvironment()

Fields:
public static final CaveNodeType[] EMPTY_ARRAY
private final String name
private final CavePrefabContainer prefabContainer
private final IWeightedMap<BlockFluidEntry> fillings
private final CaveNodeShapeEnum.CaveNodeShapeGenerator shapeGenerator
private final ICoordinateCondition heightCondition
private final IDoubleRange childrenCountBounds
private final CaveNodeType.CaveNodeCoverEntry[] covers
private final int priority
private final int environment
private CaveNodeType.CaveNodeChildEntry[] children
