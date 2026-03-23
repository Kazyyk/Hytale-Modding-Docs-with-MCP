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

Also in this package: MigratePrefabSpawn, PrefabSpawnerModule, PrefabSpawnerSettingsPage, PrefabSpawnerSettingsPageEventData

Complete API:
  public static ComponentType<ChunkStore,PrefabSpawnerBlock> getComponentType()
  public String getPrefabPath()
  public void setPrefabPath(String prefabPath)
  public boolean isFitHeightmap()
  public void setFitHeightmap(boolean fitHeightmap)
  public boolean isInheritSeed()
  public void setInheritSeed(boolean inheritSeed)
  public boolean isInheritHeightCondition()
  public void setInheritHeightCondition(boolean inheritHeightCondition)
  public PrefabWeights getPrefabWeights()
  public void setPrefabWeights(PrefabWeights prefabWeights)
  private PrefabWeights getPrefabWeightsNullable()
  public Component<ChunkStore> clone()

Fields:
public static final KeyedCodec<Boolean> FIT_HEIGHTMAP_CODEC
public static final KeyedCodec<Boolean> INHERIT_SEED_CODEC
public static final KeyedCodec<Boolean> INHERIT_HEIGHT_CONDITION_CODEC
public static final KeyedCodec<PrefabWeights> PREFAB_WEIGHTS_CODEC
public static final BuilderCodec<PrefabSpawnerBlock> CODEC
private String prefabPath
private boolean fitHeightmap
private boolean inheritSeed
private boolean inheritHeightCondition
private PrefabWeights prefabWeights
