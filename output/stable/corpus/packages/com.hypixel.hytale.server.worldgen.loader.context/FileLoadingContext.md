# FileLoadingContext

Type: interface | Package: com.hypixel.hytale.server.worldgen.loader.context | Extends: FileContext<FileLoadingContext>

public class FileLoadingContext extends FileContext<FileLoadingContext>

## Fields

- private final FileContext.Registry<ZoneFileContext> zones
- private final FileContext.Registry<PrefabCategory> prefabCategories
- private int zoneIdCounter
- private int biomeIdCounter

## Methods

- @Nonnull public FileLoadingContext getParentContext()
- @Nonnull public FileContext.Registry<ZoneFileContext> getZones()
- @Nonnull public FileContext.Registry<PrefabCategory> getPrefabCategories()
- @Nonnull protected ZoneFileContext createZone(String name, Path path)
- @Nonnull protected ZoneFileContext createZone(int id, String name, Path path)
- protected int nextZoneId()
- protected int nextBiomeId()
- protected int updateZoneId(int id)
- protected int updateBiomeId(int id)
- protected static void validateId(int id, int currentId, String type)
- public FileLoadingContext(@Nonnull Path filepath)

## Inner Types

- `FileLoadingContext.Constants`

Also in this package: BiomeFileContext, Constants, Constants, Constants, Constants, FileContext, FileContextLoader, Registry, Type, ZoneFileContext

Complete API:
  public FileLoadingContext getParentContext()
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
