# PrefabSpawnerBlock

Type: class | Package: com.hypixel.hytale.server.core.modules.prefabspawner | Implements: Component<ChunkStore>

public class PrefabSpawnerBlock implements Component<ChunkStore>

Component attached to chunk store block entities that configures prefab spawning. Stores the prefab path (dot-notation), whether the child prefab should follow the heightmap, inherit the parent seed, inherit the height condition, and per-prefab probability weights.

## Methods

- static ComponentType<ChunkStore, PrefabSpawnerBlock> getComponentType()
- String getPrefabPath()
- void setPrefabPath(String prefabPath)
- boolean isFitHeightmap()
- void setFitHeightmap(boolean fitHeightmap)
- boolean isInheritSeed()
- void setInheritSeed(boolean inheritSeed)
- boolean isInheritHeightCondition()
- void setInheritHeightCondition(boolean inheritHeightCondition)
- PrefabWeights getPrefabWeights()
- void setPrefabWeights(PrefabWeights prefabWeights)
- @Nullable Component<ChunkStore> clone()

## Inner Types

- PrefabSpawnerBlock.PrefabSpawnerSettingsPage -- custom UI page for editing spawner settings
- PrefabSpawnerBlock.PrefabSpawnerSettingsPageEventData -- event data for the settings page
