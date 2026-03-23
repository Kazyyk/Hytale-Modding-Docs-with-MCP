# DefaultAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMap

public class DefaultAssetMap<K, T extends JsonAsset<K>> extends AssetMap<K, T>

Default implementation of `AssetMap` using case-insensitive hash maps. Supports asset chains (multiple packs overriding the same key), tag-based indexing, path-to-key mapping, and parent-child asset relationships. Uses `StampedLock` for concurrent read/write safety.

## Fields


public static final DefaultAssetMap.AssetRef[] EMPTY_PAIR_ARRAY


public static final String DEFAULT_PACK_KEY = "Hytale:Hytale"

## Key Methods


@Nullable
@Override
public T getAsset(K key)


@Override
public int getAssetCount()


@Nonnull
@Override
public Map<K, T> getAssetMap()


@Override
public Set<K> getKeysForTag(int tagIndex)


@Override
public Set<K> getKeysForPack(@Nonnull String name)
