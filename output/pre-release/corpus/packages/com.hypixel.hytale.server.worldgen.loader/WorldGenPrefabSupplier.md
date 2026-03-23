# WorldGenPrefabSupplier

Type: class | Package: com.hypixel.hytale.server.worldgen.loader | Implements: com.hypixel.hytale.server.core.prefab.selection.buffer.PrefabSupplier

public class WorldGenPrefabSupplier implements PrefabSupplier

Implements `PrefabSupplier` for world generation. Lazily loads prefab buffers via `ChunkGenerator.getResource()`, resolves the prefab name from the file path, and computes chunk bounds recursively including child prefabs up to depth 10.
