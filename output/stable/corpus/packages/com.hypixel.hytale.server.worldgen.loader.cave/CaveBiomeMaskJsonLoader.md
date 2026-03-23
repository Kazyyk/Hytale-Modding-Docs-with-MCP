# CaveBiomeMaskJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.cave | Extends: JsonLoader<SeedStringResource, Int2FlagsCondition>

public class CaveBiomeMaskJsonLoader extends JsonLoader<SeedStringResource, Int2FlagsCondition>

JSON loader that parses cave biome mask configuration into an `Int2FlagsCondition`. Combines separate generation and population mask conditions with flag-based operators. Supports a "Terminate" flag that controls whether caves can continue through the biome boundary.
