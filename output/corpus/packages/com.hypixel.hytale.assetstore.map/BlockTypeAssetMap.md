# BlockTypeAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMapWithIndexes

public class BlockTypeAssetMap<K, T extends JsonAssetWithMap<K, BlockTypeAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>

Specialized asset map for block types. Maintains a dense array for O(1) index-based lookup, a key-to-index mapping, sub-key grouping, and deprecated group ID tracking. Thread-safe via `StampedLock` and `ReentrantLock`.

## Methods


public int getIndex(K key)


public int getNextIndex()


@Nullable
public T getAsset(int index)


@Nonnull
public ObjectSet<K> getSubKeys(K key)


public int getGroupId(String group)


@Nonnull
public String[] getGroups()
