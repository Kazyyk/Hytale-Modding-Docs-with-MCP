# PrefabSpawnerBlock.PrefabSpawnerSettingsPageEventData

Type: class | Package: com.hypixel.hytale.server.core.modules.prefabspawner

public static class PrefabSpawnerBlock.PrefabSpawnerSettingsPageEventData

Data class carrying event data from the prefab spawner settings UI page. Contains the edited prefab path, boolean flags, default weight, and prefab weights string.

## Constants

- KEY_PREFAB_PATH | String | "@PrefabPath"
- KEY_FIT_HEIGHTMAP | String | "@FitHeightmap"
- KEY_INHERIT_SEED | String | "@InheritSeed"
- KEY_INHERIT_HEIGHT_CONDITION | String | "@InheritHeightCondition"
- KEY_DEFAULT_WEIGHT | String | "@DefaultWeight"
- KEY_PREFAB_WEIGHTS | String | "@PrefabWeights"

## See Also

- PrefabSpawnerBlock

Also in this package: MigratePrefabSpawn, PrefabSpawnerBlock, PrefabSpawnerModule, PrefabSpawnerSettingsPage

Fields:
public static final String KEY_PREFAB_PATH
public static final String KEY_FIT_HEIGHTMAP
public static final String KEY_INHERIT_SEED
public static final String KEY_INHERIT_HEIGHT_CONDITION
public static final String KEY_DEFAULT_WEIGHT
public static final String KEY_PREFAB_WEIGHTS
public static final BuilderCodec<PrefabSpawnerBlock.PrefabSpawnerSettingsPageEventData> CODEC
private String prefabPath
private boolean fitHeightmap
private boolean inheritSeed
private boolean inheritHeightCondition
private double defaultWeight
private String prefabWeights
