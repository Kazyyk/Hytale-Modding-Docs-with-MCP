---
title: "HomeOrSpawnPoint"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.gameplay.respawn"
fqcn: "com.hypixel.hytale.server.core.asset.type.gameplay.respawn.HomeOrSpawnPoint"
api_surface: false
extends: null
implements: ["RespawnController"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "gameplay"
  - "respawn"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.gameplay.respawn`

```java
public class HomeOrSpawnPoint implements RespawnController
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `HomeOrSpawnPoint` | `INSTANCE` |
| `public static final` | `BuilderCodec<HomeOrSpawnPoint>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `CompletableFuture<Void>` | `respawnPlayer(World world, Ref<EntityStore> playerReference, ComponentAccessor<EntityStore> commandBuffer)` |
