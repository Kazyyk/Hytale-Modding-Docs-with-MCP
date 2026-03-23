# CaveTypesJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: com.hypixel.hytale.procedurallib.json.JsonLoader

public class CaveTypesJsonLoader extends JsonLoader<SeedStringResource, CaveType[]>

JSON loader that parses the `Types` array from a caves JSON file. For each entry, delegates to `CaveTypeJsonLoader` to produce a `CaveType`. Supports modify events via `ModifyEvents.CaveTypes`.
