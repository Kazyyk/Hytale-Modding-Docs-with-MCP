---
title: "AssetStoreUtil"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.util"
fqcn: "com.hypixel.hytale.builtin.asseteditor.util.AssetStoreUtil"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "util"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.util`

```java
public class AssetStoreUtil
```

Static utility for resolving asset IDs from integer indices across different `AssetMap` implementations.

## Methods

```java
@Deprecated
public static <K, T extends JsonAssetWithMap<K, M>, M extends AssetMap<K, T>> String getIdFromIndex(AssetStore<K, T, M> assetStore, int assetIndex)
```

Resolves an asset's string ID from its integer index. Supports `BlockTypeAssetMap`, `IndexedLookupTableAssetMap`, and `LookupTableAssetMap`. Throws `IllegalArgumentException` for unsupported map types.

Marked `@Deprecated` -- used by legacy packet handling paths.
