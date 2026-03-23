# ZonePatternProviderJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.zone | Extends: JsonLoader<SeedStringResource, ZonePatternProvider>

public class ZonePatternProviderJsonLoader extends JsonLoader<SeedStringResource, ZonePatternProvider>

## Fields

- protected final MaskProvider maskProvider
- protected Zone[] zones
- protected Map<String, Zone> zoneLookup
- ZoneColorMapping colorMapping
- Zone.UniqueEntry[] uniqueZones
- String KEY_GRID_GENERATOR
- String KEY_UNIQUE_ZONES
- String KEY_MASK_MAPPING
- String ERROR_UNMAPPED_COLOR
- String ERROR_NO_MAPPING
- int UNIQUE_ZONE_CANDIDATE_POS_LIMIT

## Constructors

- public ZonePatternProviderJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, MaskProvider maskProvider)

## Methods

- public void setZones(Zone[] zones)
- public ZonePatternProvider load()
- return new ZonePatternProvider(this.loadGridGenerator()
- protected IPointGenerator loadGridGenerator()
- protected ZoneColorMapping loadColorMapping()
- throw new IllegalArgumentException("Could not find mappings for colors in mask file. Keyword: MaskMapping")
- public Set<String> loadZoneRequirement()
- return new ZoneRequirementJsonLoader(this.seed, this.dataFolder, this.json)
- protected void ensureMaskIntegrity(@Nonnull ZoneColorMapping zoneColorMapping)
- throw new NullPointerException(Integer.toHexString(rgb)
- protected Zone.UniqueCandidate[] loadUniqueZoneCandidates()
- protected static void validateMapping(@Nullable ClimateType parent, @Nonnull ClimateType type, @Nonnull ClimateColor color, ZoneColorMapping mapping, String prefix)
- throw new Error(prefix + "Color is not mapped in climate type: " + ClimateType.name(parent, type)
- throw new Error(prefix + "Shore is not mapped in climate type: " + ClimateType.name(parent, type)
- throw new Error(prefix + "Ocean is not mapped in climate type: " + ClimateType.name(parent, type)
- throw new Error(prefix + "ShallowOcean is not mapped in climate type: " + ClimateType.name(parent, type)

## Inner Types

- `ZonePatternProviderJsonLoader.Constants`

## Related Types

- UniqueZoneEntryJsonLoader
- ZoneColorMappingJsonLoader
- ZoneRequirementJsonLoader
