# CaveFileContext

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.context | Extends: com.hypixel.hytale.server.worldgen.loader.context.FileContext

public class CaveFileContext extends FileContext<ZoneFileContext>

File context for cave configuration files. Extends `FileContext<ZoneFileContext>`. Resolves the cave file path by replacing dots with the file separator and locating it under the zone's `Cave` subdirectory.
