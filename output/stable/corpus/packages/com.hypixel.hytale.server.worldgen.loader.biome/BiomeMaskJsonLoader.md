# BiomeMaskJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.biome | Extends: JsonLoader<SeedStringResource, IIntCondition>

public class BiomeMaskJsonLoader extends JsonLoader<SeedStringResource, IIntCondition>

Loads a biome mask condition from JSON. Biome masks define which biome IDs are included or excluded, producing an `IIntCondition` that tests whether a given biome ID passes the mask. Supports cached file-based masks via `FileMaskCache`.
