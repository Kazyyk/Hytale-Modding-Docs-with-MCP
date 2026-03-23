# AssetCodec

Type: interface | Package: com.hypixel.hytale.assetstore.codec | Extends: JsonAsset<K>> extends InheritCodec<T>, ValidatableCodec<T>

public interface AssetCodec<K, T extends JsonAsset<K>> extends InheritCodec<T>, ValidatableCodec<T>

## Methods

- KeyedCodec<K> getKeyCodec()
- KeyedCodec<K> getParentCodec()
- AssetExtraInfo.Data getData(T var1)
- T decodeJsonAsset(RawJsonReader var1, AssetExtraInfo<K> var2)
- T decodeAndInheritJsonAsset(RawJsonReader var1, T var2, AssetExtraInfo<K> var3)
