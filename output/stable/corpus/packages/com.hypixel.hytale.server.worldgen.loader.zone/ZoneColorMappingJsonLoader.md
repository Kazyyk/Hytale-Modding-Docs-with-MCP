# ZoneColorMappingJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.zone | Extends: JsonLoader<SeedStringResource, ZoneColorMapping>

public class ZoneColorMappingJsonLoader extends JsonLoader<SeedStringResource, ZoneColorMapping>

## Fields

- protected final Map<String, Zone> zoneLookup
- ZoneColorMapping colorMapping
- JsonObject mappingObj
- int rgb
- JsonArray arr
- Zone[] zoneArr
- String zoneName
- Zone zone

## Constructors

- public ZoneColorMappingJsonLoader(SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json, Map<String, Zone> zoneLookup)

## Methods

- public ZoneColorMapping load()
- throw new IllegalArgumentException(String.format("Zone with name %s was not found for color %s!", zoneName, entry.getKey()
- public static void collectZones(Set<String> zoneSet, @Nullable JsonElement json)

Also in this package: Constants, Constants, Constants, Constants, Constants, UniqueZoneEntryJsonLoader, ZoneBiomesJsonLoader, ZoneCustomBiomesJsonLoader, ZoneJsonLoader, ZonePatternProviderJsonLoader, ZoneRequirementJsonLoader

Complete API:
  public ZoneColorMapping load()
  public static void collectZones(Set<String> zoneSet, JsonElement json)

Fields:
protected final Map<String,Zone> zoneLookup
