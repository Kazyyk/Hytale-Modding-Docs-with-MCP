# CaseInsensitiveHashStrategy

Type: class | Package: com.hypixel.hytale.assetstore.map | Implements: Hash.Strategy

public class CaseInsensitiveHashStrategy<K> implements Strategy<K>

Singleton hash strategy providing case-insensitive hashing and equality for `String` keys. For non-string keys, delegates to standard `hashCode()` and `equals()`.

## Methods


public static <K> CaseInsensitiveHashStrategy<K> getInstance()


public int hashCode(K key)


public boolean equals(K a, K b)

Also in this package: AssetMapWithIndexes, AssetRef, BlockTypeAssetMap, DefaultAssetMap, IndexedAssetMap, IndexedLookupTableAssetMap, JsonAssetWithMap, LookupTableAssetMap, ProvidedIndexAssetMap

Complete API:
  public static CaseInsensitiveHashStrategy<K> getInstance()
  public int hashCode(K key)
  public boolean equals(K a, K b)

Fields:
private static final CaseInsensitiveHashStrategy INSTANCE
