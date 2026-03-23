---
title: "AssetPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.packet"
fqcn: "com.hypixel.hytale.server.core.asset.packet.AssetPacketGenerator"
api_surface: false
extends: null
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
public abstract class AssetPacketGenerator<K, T, M>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `ToClientPacket` | `generateInitPacket(M var1, Map<K,T> var2)` |
| `public abstract` | `ToClientPacket` | `generateUpdatePacket(M var1, Map<K,T> var2, AssetUpdateQuery var3)` |
| `@Nullable public abstract` | `ToClientPacket` | `generateRemovePacket(M var1, Set<K> var2, AssetUpdateQuery var3)` |
