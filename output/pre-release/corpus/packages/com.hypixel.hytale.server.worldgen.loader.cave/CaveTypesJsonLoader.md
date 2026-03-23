# CaveTypesJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: com.hypixel.hytale.procedurallib.json.JsonLoader

public class CaveTypesJsonLoader extends JsonLoader<SeedStringResource, CaveType[]>

JSON loader that parses the `Types` array from a caves JSON file. For each entry, delegates to `CaveTypeJsonLoader` to produce a `CaveType`. Supports modify events via `ModifyEvents.CaveTypes`.

Also in this package: CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeTypeJsonLoader, CaveNodeTypeStorage, CavePrefabConfigJsonLoader, CavePrefabContainerJsonLoader, CavePrefabEntryJsonLoader, CaveTypeJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public CaveType[] load()
  protected CaveType loadCaveType(JsonObject json)

Fields:
protected final Path caveFolder
protected final ZoneFileContext zoneContext
protected final CaveFileContext caveContext
