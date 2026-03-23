# CaveNodeCoverEntryJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CaveNodeType.CaveNodeCoverEntry>

public class CaveNodeCoverEntryJsonLoader extends JsonLoader<SeedStringResource, CaveNodeType.CaveNodeCoverEntry>

JSON loader for cave cover entries (floor/ceiling decorations). Parses weighted block type entries, height threshold conditions, noise mask conditions, density conditions, parent block conditions, and the anchor type (FLOOR or CEILING).

Also in this package: CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeTypeJsonLoader, CaveNodeTypeStorage, CavePrefabConfigJsonLoader, CavePrefabContainerJsonLoader, CavePrefabEntryJsonLoader, CaveTypeJsonLoader, CaveTypesJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public CaveNodeType.CaveNodeCoverEntry load()
  protected IWeightedMap<CaveNodeType.CaveNodeCoverEntry.Entry> loadEntries()
  protected ICoordinateRndCondition loadHeightCondition()
  protected ICoordinateCondition loadMapCondition()
  protected ICoordinateCondition loadDensityCondition()
  protected IBlockFluidCondition loadParentCondition()
  protected int loadOffset()
  protected CaveNodeType.CaveNodeCoverType loadAnchorType()

Fields:
private static final IBlockFluidCondition DEFAULT_PARENT_MASK
