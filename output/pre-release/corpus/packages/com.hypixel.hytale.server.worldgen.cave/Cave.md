# Cave

Type: class | Package: com.hypixel.hytale.server.worldgen.cave

public class Cave

Represents a generated cave structure containing cave nodes organized by chunk index, with bounds tracking.

## Key Methods

- public long getNodeCount()
- public CaveType getCaveType()
- public WorldBounds getBounds()
- public void addNode(@Nonnull CaveNode element)
- public boolean contains(long chunkIndex)
- public CaveNode[] getCaveNodes(long chunkIndex)
- public void compile()
- public String toString()

Also in this package: CaveBiomeMaskFlags, CaveBlockPriorityModifier, CaveGenerator, CaveNodeChildEntry, CaveNodeCoverEntry, CaveNodeCoverType, CaveNodeType, CavePrefabPlacement, CaveType, CaveYawMode, Defaults, Entry, FluidLevel, OrientationModifier, PrefabPlacementFunction

Complete API:
  public long getNodeCount()
  public CaveType getCaveType()
  public WorldBounds getBounds()
  public void addNode(CaveNode element)
  public boolean contains(long chunkIndex)
  public CaveNode[] getCaveNodes(long chunkIndex)
  public void compile()
  private void compileNodeMap()
  public String toString()

Fields:
private static final Comparator<CaveNode> ORDER
private Long2ObjectMap<List<CaveNode>> rawChunkNodeMap
private Long2ObjectMap<CaveNode[]> chunkNodeMap
private final CaveType caveType
private final WorldBounds bounds
private int nodeCount
