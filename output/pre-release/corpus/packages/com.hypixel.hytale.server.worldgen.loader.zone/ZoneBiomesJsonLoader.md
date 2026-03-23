# ZoneBiomesJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.zone | Extends: JsonLoader<SeedStringResource, IWeightedMap<TileBiome>>

public class ZoneBiomesJsonLoader extends JsonLoader<SeedStringResource, IWeightedMap<TileBiome>>

## Fields

- protected final ZoneFileContext zoneContext
- WeightedMap.Builder<TileBiome> builder
- TileBiome biome
- JsonElement biomeJson
- String ERROR_BIOME_FILES_NULL
- String ERROR_BIOME_FAILED
- String ERROR_NO_TILE_BIOMES
- String FILE_TILE_PREFIX
- String FILE_TILE_SUFFIX

## Constructors

- public ZoneBiomesJsonLoader(SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, ZoneFileContext zone)

## Methods

- public IWeightedMap<TileBiome> load()
- throw new IllegalArgumentException("Could not find any tile biomes for this zone!")
- protected TileBiome loadBiome(@Nonnull BiomeFileContext biomeContext)
- return new TileBiomeJsonLoader(this.seed, this.dataFolder, biomeJson, biomeContext)
- throw new Error(String.format("Error while loading tile biome \"%s\" from \"%s\"", biomeContext.getName()

## Inner Types

- `ZoneBiomesJsonLoader.Constants`
