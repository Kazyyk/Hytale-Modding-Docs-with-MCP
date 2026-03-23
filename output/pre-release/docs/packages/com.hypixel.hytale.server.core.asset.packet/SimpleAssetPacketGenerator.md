---
title: "SimpleAssetPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.packet"
fqcn: "com.hypixel.hytale.server.core.asset.packet.SimpleAssetPacketGenerator"
api_surface: false
extends: "AssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "packet"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.packet`

```java
public abstract class SimpleAssetPacketGenerator<K, T, M> extends AssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public abstract` | `ToClientPacket` | `generateInitPacket(M var1, Map<K,T> var2)` |
| `@Override public` | `ToClientPacket` | `generateUpdatePacket(M assetMap, Map<K,T> loadedAssets, AssetUpdateQuery query)` |
| `@Override public` | `ToClientPacket` | `generateRemovePacket(M assetMap, Set<K> removed, AssetUpdateQuery query)` |
| `protected abstract` | `ToClientPacket` | `generateUpdatePacket(M var1, Map<K,T> var2)` |
| `@Nullable protected abstract` | `ToClientPacket` | `generateRemovePacket(M var1, Set<K> var2)` |
