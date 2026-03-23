# CavePrefabEntryJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CavePrefabContainer.CavePrefabEntry>

public class CavePrefabEntryJsonLoader extends JsonLoader<SeedStringResource, CavePrefabContainer.CavePrefabEntry>

JSON loader for individual cave prefab entries. Loads a weighted prefab map and its placement configuration via CavePrefabConfigJsonLoader.

Also in this package: CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeTypeJsonLoader, CaveNodeTypeStorage, CavePrefabConfigJsonLoader, CavePrefabContainerJsonLoader, CaveTypeJsonLoader, CaveTypesJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public CavePrefabContainer.CavePrefabEntry load()
  protected IWeightedMap<WorldGenPrefabSupplier> loadPrefabs()
  protected CavePrefabContainer.CavePrefabEntry.CavePrefabConfig loadConfig()

Fields:
private final ZoneFileContext zoneContext
