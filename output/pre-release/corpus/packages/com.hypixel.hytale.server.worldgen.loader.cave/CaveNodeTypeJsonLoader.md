# CaveNodeTypeJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: com.hypixel.hytale.procedurallib.json.JsonLoader

public class CaveNodeTypeJsonLoader extends JsonLoader<SeedStringResource, CaveNodeType>

JSON loader that parses a cave node type definition. Loads the node's prefabs, fillings, shape generator, height condition, children count bounds, cover entries, priority, environment, and child entries. Registers the resulting `CaveNodeType` in a `CaveNodeTypeStorage`.
