# CaveNodeTypeJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: com.hypixel.hytale.procedurallib.json.JsonLoader

public class CaveNodeTypeJsonLoader extends JsonLoader<SeedStringResource, CaveNodeType>

JSON loader that parses a cave node type definition. Loads the node's prefabs, fillings, shape generator, height condition, children count bounds, cover entries, priority, environment, and child entries. Registers the resulting `CaveNodeType` in a `CaveNodeTypeStorage`.

Also in this package: CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeTypeStorage, CavePrefabConfigJsonLoader, CavePrefabContainerJsonLoader, CavePrefabEntryJsonLoader, CaveTypeJsonLoader, CaveTypesJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public CaveNodeType load()
  protected CaveNodeType.CaveNodeChildEntry[] loadChildren()
  protected CavePrefabContainer loadPrefabs()
  protected IWeightedMap<BlockFluidEntry> loadFillings()
  protected CaveNodeShapeEnum.CaveNodeShapeGenerator loadShapeGenerator()
  protected ICoordinateCondition loadHeightCondition()
  protected IDoubleRange loadChildCountBounds()
  protected CaveNodeType.CaveNodeCoverEntry[] loadCovers()
  protected int loadPriority()
  protected int loadEnvironment()

Fields:
protected final String name
protected final CaveNodeTypeStorage storage
protected final ZoneFileContext zoneContext
protected final CaveFileContext caveContext
