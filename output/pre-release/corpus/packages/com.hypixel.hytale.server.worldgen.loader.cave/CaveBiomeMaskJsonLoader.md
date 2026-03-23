# CaveBiomeMaskJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, Int2FlagsCondition>

public class CaveBiomeMaskJsonLoader extends JsonLoader<SeedStringResource, Int2FlagsCondition>

JSON loader that parses cave biome mask configuration into an `Int2FlagsCondition`. Combines separate generation and population mask conditions with flag-based operators. Supports a "Terminate" flag that controls whether caves can continue through the biome boundary.

Also in this package: CaveGeneratorJsonLoader, CaveNodeChildEntryJsonLoader, CaveNodeCoverEntryJsonLoader, CaveNodeTypeJsonLoader, CaveNodeTypeStorage, CavePrefabConfigJsonLoader, CavePrefabContainerJsonLoader, CavePrefabEntryJsonLoader, CaveTypeJsonLoader, CaveTypesJsonLoader, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants, Constants (and 3 more)

Complete API:
  public Int2FlagsCondition load()
  protected IIntCondition loadGenerationMask()
  protected IIntCondition loadPopulationMask()
  protected CompositeInt2Flags.FlagCondition[] loadFlagConditions(IIntCondition generate, IIntCondition populate)
  protected int loadDefaultResult()
  protected IIntCondition loadBiomeMask(String maskName)
  protected boolean loadFlagSetting(String key, boolean defaultValue)

Fields:
private final ZoneFileContext zoneContext
