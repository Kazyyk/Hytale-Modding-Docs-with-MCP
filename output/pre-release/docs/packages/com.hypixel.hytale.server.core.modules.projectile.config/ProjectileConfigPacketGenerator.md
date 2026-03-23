---
title: "ProjectileConfigPacketGenerator"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.projectile.config"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.config.ProjectileConfigPacketGenerator"
api_surface: false
extends: "DefaultAssetPacketGenerator<String, ProjectileConfig>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "projectile"
  - "network"
  - "packet"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.config`

```java
public class ProjectileConfigPacketGenerator extends DefaultAssetPacketGenerator<String, ProjectileConfig>
```

Generates network packets for projectile config asset synchronization. Produces `UpdateProjectileConfigs` packets for init, update, and remove operations.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ToClientPacket` | `generateInitPacket(@Nonnull DefaultAssetMap<String, ProjectileConfig> assetMap, Map<String, ProjectileConfig> assets)` |
| `public` | `ToClientPacket` | `generateUpdatePacket(@Nonnull Map<String, ProjectileConfig> loadedAssets)` |
| `public` | `ToClientPacket` | `generateRemovePacket(@Nonnull Set<String> removed)` |
