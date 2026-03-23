---
title: "DefaultAssetPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.packet"
fqcn: "com.hypixel.hytale.server.core.asset.packet.DefaultAssetPacketGenerator"
api_surface: false
extends: "SimpleAssetPacketGenerator"
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
public abstract class DefaultAssetPacketGenerator<K, T> extends SimpleAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `ToClientPacket` | `generateInitPacket(DefaultAssetMap<K,T> var1, Map<K,T> var2)` |
| `public abstract` | `ToClientPacket` | `generateUpdatePacket(Map<K,T> var1)` |
| `@Nullable public abstract` | `ToClientPacket` | `generateRemovePacket(Set<K> var1)` |
| `public final` | `ToClientPacket` | `generateUpdatePacket(DefaultAssetMap<K,T> assetMap, Map<K,T> loadedAssets)` |
| `@Nullable public final` | `ToClientPacket` | `generateRemovePacket(DefaultAssetMap<K,T> assetMap, Set<K> removed)` |
