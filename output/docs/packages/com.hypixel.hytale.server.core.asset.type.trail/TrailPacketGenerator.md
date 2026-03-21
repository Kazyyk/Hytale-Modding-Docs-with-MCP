---
title: "TrailPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.trail"
fqcn: "com.hypixel.hytale.server.core.asset.type.trail.TrailPacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "asset"
  - "type"
  - "trail"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.trail`

```java
public class TrailPacketGenerator extends DefaultAssetPacketGenerator<String, Trail>
```

Generates init, update, and remove network packets for `Trail` assets.

## Methods

| Method | Returns | Description |
|---|---|---|
| `generateInitPacket(DefaultAssetMap<String, Trail> assetMap, Map<String, Trail> assets)` | `ToClientPacket` | Instance method. |
| `generateUpdatePacket(Map<String, Trail> loadedAssets)` | `ToClientPacket` | Instance method. |
| `generateRemovePacket(Set<String> removed)` | `ToClientPacket` | Instance method. |
