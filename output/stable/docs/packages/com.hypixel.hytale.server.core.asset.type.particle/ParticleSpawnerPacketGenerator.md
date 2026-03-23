---
title: "ParticleSpawnerPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.particle"
fqcn: "com.hypixel.hytale.server.core.asset.type.particle.ParticleSpawnerPacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "particle"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.particle`

```java
public class ParticleSpawnerPacketGenerator extends DefaultAssetPacketGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `ToClientPacket` | `generateInitPacket(DefaultAssetMap<String,ParticleSpawner> assetMap, Map<String,ParticleSpawner> assets)` |
| `@Nonnull @Override public` | `ToClientPacket` | `generateUpdatePacket(Map<String,ParticleSpawner> loadedAssets)` |
| `@Nonnull @Override public` | `ToClientPacket` | `generateRemovePacket(Set<String> removed)` |
