# ZoneFileContext

Type: interface | Package: com.hypixel.hytale.server.worldgen.loader.context | Extends: FileContext<FileLoadingContext>

public class ZoneFileContext extends FileContext<FileLoadingContext>

## Fields

- private final FileContext.Registry<BiomeFileContext> tileBiomes
- private final FileContext.Registry<BiomeFileContext> customBiomes

## Methods

- @Nonnull public FileContext.Registry<BiomeFileContext> getTileBiomes()
- @Nonnull public FileContext.Registry<BiomeFileContext> getCustomBiomes()
- @Nonnull public FileContext.Registry<BiomeFileContext> getBiomes(@Nonnull BiomeFileContext.Type type)
- @Nonnull public ZoneFileContext matchContext(@Nullable JsonElement json, String key)
- @Nonnull public ZoneFileContext matchContext(@Nonnull String filePath)
- @Nonnull protected BiomeFileContext createBiome(String name, Path path, BiomeFileContext.Type type)
- @Nonnull protected BiomeFileContext createBiome(int id, String name, Path path, BiomeFileContext.Type type)
- public ZoneFileContext(int id, String name, Path filepath, FileLoadingContext context)

## Inner Types

- `ZoneFileContext.Constants`

Also in this package: BiomeFileContext, CaveFileContext, Constants, Constants, Constants, Constants, FileContext, FileContextLoader, FileLoadingContext, Registry, RootContext, Type

Complete API:
  public FileContext.Registry<BiomeFileContext> getTileBiomes()
  public FileContext.Registry<BiomeFileContext> getCustomBiomes()
  public FileContext.Registry<BiomeFileContext> getBiomes(BiomeFileContext.Type type)
  public ZoneFileContext matchContext(JsonElement json, String key)
  public ZoneFileContext matchContext(String filePath)
  protected BiomeFileContext createBiome(String name, Path path, BiomeFileContext.Type type)
  protected BiomeFileContext createBiome(int id, String name, Path path, BiomeFileContext.Type type)

Fields:
private final FileContext.Registry<BiomeFileContext> tileBiomes
private final FileContext.Registry<BiomeFileContext> customBiomes
