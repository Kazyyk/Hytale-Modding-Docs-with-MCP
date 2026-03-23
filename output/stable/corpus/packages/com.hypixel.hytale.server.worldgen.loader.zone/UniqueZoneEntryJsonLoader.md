# UniqueZoneEntryJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.zone | Extends: null

public class UniqueZoneEntryJsonLoader extends JsonLoader<SeedStringResource, Zone.UniqueEntry[]>

## Fields

- protected final Map<String, Zone> zoneLookup
- JsonArray arrayJson
- Zone.UniqueEntry[] entries
- JsonElement entry
- JsonElement zoneJson
- JsonElement colorJson
- JsonElement parentJson
- JsonElement radiusJson
- JsonElement paddingJson
- Zone zone
- int color
- int[] parent
- int radius
- int padding
- JsonArray arr
- int[] colors
- JsonElement zone
- String KEY_ZONE
- String KEY_COLOR
- String KEY_PARENT
- String KEY_RADIUS
- String KEY_PADDING
- int DEFAULT_RADIUS
- int DEFAULT_PADDING
- String ERROR_ENTRIES_TYPE
- String ERROR_ENTRY_TYPE
- String ERROR_PARENT_TYPE
- String ERROR_MISSING_ZONE
- String ERROR_MISSING_COLOR
- String ERROR_MISSING_PARENT

## Constructors

- public UniqueZoneEntryJsonLoader(SeedString<SeedStringResource> seed, Path dataFolder, @Nullable JsonElement json, Map<String, Zone> zoneLookup)

## Methods

- public Zone.UniqueEntry[] load()
- throw new Error("Unexpected type for 'UniqueZones' field, expected array")
- throw new Error("Unexpected type for unique zone entry: #" + i)
- protected Zone.UniqueEntry loadEntry(int index, JsonObject json)
- throw new Error("Missing 'Zone' field in unique zone entry: #" + index)
- throw new Error("Missing 'Color' field in unique zone entry: #" + index)
- throw new Error("Missing 'Parent' field in unique zone entry: #" + index)
- throw new Error("Unknown zone '" + zoneJson.getAsString()
- protected static int[] loadParentColors(int index, JsonElement json)
- throw new Error("Unexpected type for 'Parent' field in unique zone entry: #" + index)
- public static void collectZones(Set<String> zoneSet, @Nullable JsonElement json)
- throw new Error("Missing 'Zone' field in unique zone entry: #" + i)

## Inner Types

- `UniqueZoneEntryJsonLoader.Constants`
