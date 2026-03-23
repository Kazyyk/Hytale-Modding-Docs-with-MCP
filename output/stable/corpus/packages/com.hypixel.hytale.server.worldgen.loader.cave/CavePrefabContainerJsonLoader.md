# CavePrefabContainerJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CavePrefabContainer>

public class CavePrefabContainerJsonLoader extends JsonLoader<SeedStringResource, CavePrefabContainer>

JSON loader for cave prefab containers. Parses the "Entries" array and delegates each entry to CavePrefabEntryJsonLoader.

Also in this package: CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeTypeJsonLoader, CaveNodeTypeStorage, CavePrefabConfigJsonLoader, CavePrefabEntryJsonLoader, CaveTypeJsonLoader, CaveTypesJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public CavePrefabContainer load()
  protected CavePrefabContainer.CavePrefabEntry[] loadEntries()

Fields:
private final ZoneFileContext zoneContext
