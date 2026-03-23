# BlockSpawnerTable

Type: class | Package: com.hypixel.hytale.builtin.blockspawner | Implements: JsonAssetWithMap

public class BlockSpawnerTable implements JsonAssetWithMap<String, DefaultAssetMap<String, BlockSpawnerTable>>

Implements `JsonAssetWithMap`.

## Fields

- protected AssetExtraInfo.Data data
- protected String id
- protected IWeightedMap<BlockSpawnerEntry> entries

## Methods

- public static DefaultAssetMap<String, BlockSpawnerTable> getAssetMap()
- public String getId()
- public IWeightedMap<BlockSpawnerEntry> getEntries()
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Override public String toString()

Also in this package: BlockSpawnerEntry, BlockSpawnerPlugin, BlockSpawnerSystem, MigrateBlockSpawner, RotationMode

Complete API:
  public static DefaultAssetMap<String,BlockSpawnerTable> getAssetMap()
  public String getId()
  public IWeightedMap<BlockSpawnerEntry> getEntries()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,BlockSpawnerTable> CODEC
private static DefaultAssetMap<String,BlockSpawnerTable> ASSET_MAP
protected AssetExtraInfo.Data data
protected String id
protected IWeightedMap<BlockSpawnerEntry> entries
