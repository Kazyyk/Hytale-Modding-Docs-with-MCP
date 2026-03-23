# CaveTypesJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CaveType[]>

public class CaveTypesJsonLoader extends JsonLoader<SeedStringResource, CaveType[]>

JSON loader for the "Types" array in `Caves.json`. Iterates over the array entries, extracts each cave type's "Name" field, and delegates to CaveTypeJsonLoader for full construction.

Also in this package: CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeTypeJsonLoader, CaveNodeTypeStorage, CavePrefabConfigJsonLoader, CavePrefabContainerJsonLoader, CavePrefabEntryJsonLoader, CaveTypeJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public CaveType[] load()
  protected CaveType loadCaveType(String name, JsonElement json)
  protected String loadName(JsonObject jsonObject)

Fields:
protected final Path caveFolder
protected final ZoneFileContext zoneContext
