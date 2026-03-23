# CaveNodeType

Type: class | Package: com.hypixel.hytale.server.worldgen.cave

public class CaveNodeType

Defines a type of cave node used in procedural cave generation. Contains the node shape generator, fillings, height condition, prefab container, cover entries, child entries, priority, and environment. Children are set after construction to support forward references.

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
public static final ListPool<CaveNodeType.CaveNodeCoverEntry> COVER_POOL
public static final ListPool<CaveNodeType.CaveNodeChildEntry> CHILD_POOL
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
