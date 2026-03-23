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

Also in this package: BlockPlacementMaskRegistry, Constants, Constants, Constants, PrefabPatternGeneratorJsonLoader, WeightedPrefabMapJsonLoader

Complete API:
  public BlockMaskCondition load()
  protected BlockMaskCondition.MaskEntry[] loadEntries(JsonArray jsonArray)
  protected JsonElement loadFileConstructor(String filePath)

Fields:
private String fileName
