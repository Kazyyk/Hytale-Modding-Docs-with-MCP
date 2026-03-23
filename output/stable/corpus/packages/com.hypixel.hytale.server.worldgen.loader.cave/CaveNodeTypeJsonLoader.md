# CaveNodeTypeJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CaveNodeType>

public class CaveNodeTypeJsonLoader extends JsonLoader<SeedStringResource, CaveNodeType>

JSON loader for individual cave node types. Parses the shape generator type (dispatching to shape-specific loaders for PIPE, CYLINDER, PREFAB, ELLIPSOID, EMPTY_LINE, DISTORTED), filling blocks, prefab containers, height conditions, child count bounds, cover entries, priority, environment, and child entries. Registers the loaded type in the CaveNodeTypeStorage.

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
