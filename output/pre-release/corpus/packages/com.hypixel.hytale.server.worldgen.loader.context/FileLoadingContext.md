# FileLoadingContext

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.context | Extends: com.hypixel.hytale.server.worldgen.loader.context.FileContext

public class FileLoadingContext extends FileContext<FileContext.RootContext>

Top-level file loading context extending `FileContext<RootContext>`. Maintains registries for zones and prefab categories, and sequential ID counters for zones and biomes. Created by `FileContextLoader` as the root of the loading hierarchy.

Also in this package: BiomeFileContext, CaveFileContext, Constants, Constants, Constants, Constants, FileContext, FileContextLoader, Registry, RootContext, Type, ZoneFileContext

Complete API:
  public FileContext.Registry<ZoneFileContext> getZones()
  public FileContext.Registry<PrefabCategory> getPrefabCategories()
  protected ZoneFileContext createZone(String name, Path path)
  protected ZoneFileContext createZone(int id, String name, Path path)
  protected int nextZoneId()
  protected int nextBiomeId()
  protected int updateZoneId(int id)
  protected int updateBiomeId(int id)
  protected static void validateId(int id, int currentId, String type)

Fields:
private final FileContext.Registry<ZoneFileContext> zones
private final FileContext.Registry<PrefabCategory> prefabCategories
private int zoneIdCounter
private int biomeIdCounter
