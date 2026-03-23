# FileLoadingContext

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.context | Extends: com.hypixel.hytale.server.worldgen.loader.context.FileContext

public class FileLoadingContext extends FileContext<FileContext.RootContext>

Top-level file loading context extending `FileContext<RootContext>`. Maintains registries for zones and prefab categories, and sequential ID counters for zones and biomes. Created by `FileContextLoader` as the root of the loading hierarchy.
