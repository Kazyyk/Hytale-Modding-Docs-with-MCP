# CaveNodeTypeJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CaveNodeType>

public class CaveNodeTypeJsonLoader extends JsonLoader<SeedStringResource, CaveNodeType>

JSON loader for individual cave node types. Parses the shape generator type (dispatching to shape-specific loaders for PIPE, CYLINDER, PREFAB, ELLIPSOID, EMPTY_LINE, DISTORTED), filling blocks, prefab containers, height conditions, child count bounds, cover entries, priority, environment, and child entries. Registers the loaded type in the CaveNodeTypeStorage.
