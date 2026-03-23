# WeightedPrefabMapJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.prefab | Extends: JsonLoader

public class WeightedPrefabMapJsonLoader extends JsonLoader<SeedStringResource, IWeightedMap<WorldGenPrefabSupplier>>

JSON loader that deserializes configuration data from JSON files.

## Methods

- public IWeightedMap<WorldGenPrefabSupplier> load()
- throw new IllegalArgumentException(this.prefabsKey)
- throw new IllegalArgumentException("Weight array size is different from prefab name array.")
- throw new IllegalArgumentException("Prefabs are defined but could not find a valid entry!")
