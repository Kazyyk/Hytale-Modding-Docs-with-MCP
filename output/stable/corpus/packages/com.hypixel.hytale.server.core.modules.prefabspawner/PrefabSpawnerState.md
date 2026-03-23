# PrefabSpawnerState

Type: class | Package: com.hypixel.hytale.server.core.modules.prefabspawner | Extends: BlockState

public class PrefabSpawnerState extends BlockState

Block state for prefab spawner blocks. Stores configuration for spawning prefabs during world generation including prefab path, heightmap fitting, seed inheritance, height condition inheritance, and weighted prefab selection.

## Fields

- public static final | String | PREFAB_SPAWNER_TYPE | Type identifier ("prefabspawner")
- public static final | Codec<PrefabSpawnerState> | CODEC | Serialization codec
- public static final | KeyedCodec<Boolean> | FIT_HEIGHTMAP_CODEC | FitHeightmap field codec
- public static final | KeyedCodec<Boolean> | INHERIT_SEED_CODEC | InheritSeed field codec
- public static final | KeyedCodec<Boolean> | INHERIT_HEIGHT_CONDITION_CODEC | InheritHeightCondition field codec
- public static final | KeyedCodec<PrefabWeights> | PREFAB_WEIGHTS_CODEC | PrefabWeights field codec

## Methods

- public String getPrefabPath()
- public void setPrefabPath(String prefabPath)
- public boolean isFitHeightmap()
- public void setFitHeightmap(boolean fitHeightmap)
- public boolean isInheritSeed()
- public void setInheritSeed(boolean inheritSeed)
- public boolean isInheritHeightCondition()
- public void setInheritHeightCondition(boolean inheritHeightCondition)
- public PrefabWeights getPrefabWeights()
- public void setPrefabWeights(PrefabWeights prefabWeights)

Also in this package: PrefabSpawnerModule, PrefabSpawnerSettingsPage, PrefabSpawnerSettingsPageEventData

Complete API:
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

Fields:
public static final String PREFAB_SPAWNER_TYPE
public static final KeyedCodec<Boolean> FIT_HEIGHTMAP_CODEC
public static final KeyedCodec<Boolean> INHERIT_SEED_CODEC
public static final KeyedCodec<Boolean> INHERIT_HEIGHT_CONDITION_CODEC
public static final KeyedCodec<PrefabWeights> PREFAB_WEIGHTS_CODEC
public static final Codec<PrefabSpawnerState> CODEC
private String prefabPath
private boolean fitHeightmap
private boolean inheritSeed
private boolean inheritHeightCondition
private PrefabWeights prefabWeights
