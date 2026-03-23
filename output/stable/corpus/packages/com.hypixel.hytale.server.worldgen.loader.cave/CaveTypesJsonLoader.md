# CaveTypesJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CaveType[]>

public class CaveTypesJsonLoader extends JsonLoader<SeedStringResource, CaveType[]>

JSON loader for the "Types" array in `Caves.json`. Iterates over the array entries, extracts each cave type's "Name" field, and delegates to CaveTypeJsonLoader for full construction.
