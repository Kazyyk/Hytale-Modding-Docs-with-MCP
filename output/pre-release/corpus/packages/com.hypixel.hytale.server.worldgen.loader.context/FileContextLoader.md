# FileContextLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.context

public class FileContextLoader

Loads the full world generation file context hierarchy. Scans the `Zones` directory for valid zone folders (containing `Zone.json`), filters by required zone names, creates `ZoneFileContext` instances, discovers biome files by type, and loads prefab categories from `PrefabCategories.json`.
