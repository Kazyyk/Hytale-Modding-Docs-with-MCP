# LookupTableAssetMap

Type: class | Package: com.hypixel.hytale.assetstore.map | Extends: AssetMapWithIndexes

public class LookupTableAssetMap<K, T extends JsonAssetWithMap<K, LookupTableAssetMap<K, T>>> extends AssetMapWithIndexes<K, T>

Asset map using externally-provided index and max-index functions for a dense backing array. Resizes automatically as the max index changes.

## Methods


@Nullable
public T getAsset(int index)


public T getAssetOrDefault(int index, T def)


@Override
public boolean requireReplaceOnRemove()

Also in this package: AssetMapWithIndexes, AssetRef, BlockTypeAssetMap, CaseInsensitiveHashStrategy, DefaultAssetMap, IndexedAssetMap, IndexedLookupTableAssetMap, JsonAssetWithMap, ProvidedIndexAssetMap

Complete API:
  public T getAsset(int index)
  public T getAssetOrDefault(int index, T def)
  protected void clear()
  protected void putAll(String packKey, AssetCodec<K,T> codec, Map<K,T> loadedAssets, Map<K,Path> loadedKeyToPathMap, Map<K,Set<K>> loadedAssetChildren)
  protected Set<K> remove(Set<K> keys)
  protected Set<K> remove(String packKey, Set<K> keys, List<Entry<String,Object>> pathsToReload)
  private void remove0(Set<K> keys)
  private void resize()
  public boolean requireReplaceOnRemove()

Fields:
private final IntFunction<T[]> arrayProvider
private final ToIntFunction<K> indexGetter
private final IntSupplier maxIndexGetter
private final ReentrantLock arrayLock
private T[] array
