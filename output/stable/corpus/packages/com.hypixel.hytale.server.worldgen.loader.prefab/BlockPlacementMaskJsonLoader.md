# BlockPlacementMaskJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.prefab | Extends: JsonLoader

public class BlockPlacementMaskJsonLoader extends JsonLoader<SeedStringResource, BlockMaskCondition>

JSON loader that deserializes configuration data from JSON files.

## Fields

- private String fileName

## Methods

- public BlockMaskCondition load()
- throw new IllegalArgumentException("Unknown key! " + variant)
- @Nonnull protected BlockMaskCondition.MaskEntry[] loadEntries(@Nonnull JsonArray jsonArray)
- @Override protected JsonElement loadFileConstructor(String filePath)
