# ZoneCustomBiomesJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.zone | Extends: null

public class ZoneCustomBiomesJsonLoader extends JsonLoader<SeedStringResource, CustomBiome[]>

## Fields

- private static final Comparator<CustomBiome> PRIORITY_SORTER
- protected final ZoneFileContext zoneContext
- protected final Biome[] tileBiomes
- int index
- CustomBiome[] biomes
- BiomeFileContext biomeContext
- JsonElement biomeJson
- CustomBiome biome
- CustomBiomeGenerator reference
- String ERROR_BIOME_FILES_NULL
- String ERROR_BIOME_FAILED
- String ERROR_NO_CUSTOM_GENERATOR
- String FILE_CUSTOM_PREFIX
- String FILE_CUSTOM_SUFFIX

## Constructors

- public ZoneCustomBiomesJsonLoader(SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, ZoneFileContext zoneContext, Biome[] tileBiomes)

## Methods

- public CustomBiome[] load()
- throw new NullPointerException(biomeContext.getPath()
- throw new Error(String.format("Error while loading custom biome \"%s\" from \"%s\"", biomeContext.getName()

## Inner Types

- `ZoneCustomBiomesJsonLoader.Constants`
