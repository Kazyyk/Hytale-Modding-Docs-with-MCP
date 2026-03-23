# FluidLevelJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CaveType.FluidLevel>

public class FluidLevelJsonLoader extends JsonLoader<SeedStringResource, CaveType.FluidLevel>

JSON loader for cave fluid level configuration. Parses the fluid type (by block type key or fluid name), fluid level byte, and height threshold to construct a `CaveType.FluidLevel` that determines flooding behavior in cave nodes.

Also in this package: CaveBiomeMaskJsonLoader, CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeTypeJsonLoader, CaveNodeTypeStorage, CavePrefabConfigJsonLoader, CavePrefabContainerJsonLoader, CavePrefabEntryJsonLoader, CaveTypeJsonLoader, CaveTypesJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public CaveType.FluidLevel load()
  protected int loadHeight()
