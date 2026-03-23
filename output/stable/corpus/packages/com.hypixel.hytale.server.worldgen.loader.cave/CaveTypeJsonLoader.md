# CaveTypeJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, CaveType>

public class CaveTypeJsonLoader extends JsonLoader<SeedStringResource, CaveType>

JSON loader for a complete cave type definition. Loads the entry node type, yaw/pitch/depth ranges, height radius factors, entry point generator, biome mask, block mask, noise mask, height condition, fixed entry height, fluid level, environment, surface-limited flag, submerge flag, and maximum size. The entry node type is loaded from a CaveNodeTypeStorage instance created per cave type.
