---
title: "JsonAssetWithMap"
kind: "interface"
package: "com.hypixel.hytale.assetstore.map"
fqcn: "com.hypixel.hytale.assetstore.map.JsonAssetWithMap"
api_surface: true
extends: ~
implements: 
  - "JsonAsset"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "asset"
  - "map"
---

**Package:** `com.hypixel.hytale.assetstore.map`

```java
public interface JsonAssetWithMap<K, M extends AssetMap<K, ?>> extends JsonAsset<K>
```

Marker interface for JSON assets that are stored in an `AssetMap`. Extends `JsonAsset` without adding additional methods.
