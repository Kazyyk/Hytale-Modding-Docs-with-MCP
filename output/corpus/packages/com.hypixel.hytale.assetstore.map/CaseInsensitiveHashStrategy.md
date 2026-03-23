# CaseInsensitiveHashStrategy

Type: class | Package: com.hypixel.hytale.assetstore.map | Implements: Hash.Strategy

public class CaseInsensitiveHashStrategy<K> implements Strategy<K>

Singleton hash strategy providing case-insensitive hashing and equality for `String` keys. For non-string keys, delegates to standard `hashCode()` and `equals()`.

## Methods


public static <K> CaseInsensitiveHashStrategy<K> getInstance()


public int hashCode(K key)


public boolean equals(K a, K b)
