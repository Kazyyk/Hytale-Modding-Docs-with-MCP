---
title: "AssetCodec"
kind: "interface"
package: "com.hypixel.hytale.assetstore.codec"
fqcn: "com.hypixel.hytale.assetstore.codec.AssetCodec"
api_surface: true
extends: "JsonAsset<K>> extends InheritCodec<T>, ValidatableCodec<T>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "assetstore"
  - "codec"
  - "interface"
---

**Package:** `com.hypixel.hytale.assetstore.codec`

```java
public interface AssetCodec<K, T extends JsonAsset<K>> extends InheritCodec<T>, ValidatableCodec<T>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `KeyedCodec<K>` | `getKeyCodec()` |
| `` | `KeyedCodec<K>` | `getParentCodec()` |
| `` | `AssetExtraInfo.Data` | `getData(T var1)` |
| `` | `T` | `decodeJsonAsset(RawJsonReader var1, AssetExtraInfo<K> var2)` |
| `` | `T` | `decodeAndInheritJsonAsset(RawJsonReader var1, T var2, AssetExtraInfo<K> var3)` |
