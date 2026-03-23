# WeightedPrefabMapJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.prefab | Extends: JsonLoader

public class WeightedPrefabMapJsonLoader extends JsonLoader<SeedStringResource, IWeightedMap<WorldGenPrefabSupplier>>

JSON loader that deserializes configuration data from JSON files.

## Methods

- public IWeightedMap<WorldGenPrefabSupplier> load()
- throw new IllegalArgumentException(this.prefabsKey)
- throw new IllegalArgumentException("Weight array size is different from prefab name array.")
- throw new IllegalArgumentException("Prefabs are defined but could not find a valid entry!")

Also in this package: BlockPlacementMaskJsonLoader, BlockPlacementMaskRegistry, Constants, Constants, Constants, PrefabPatternGeneratorJsonLoader

Complete API:
  public IWeightedMap<WorldGenPrefabSupplier> load()

Fields:
protected final String prefabsKey
protected final String weightsKey
