---
title: "RespawnController"
kind: "interface"
package: "com.hypixel.hytale.server.core.asset.type.gameplay.respawn"
fqcn: "com.hypixel.hytale.server.core.asset.type.gameplay.respawn.RespawnController"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "asset"
  - "type"
  - "gameplay"
  - "respawn"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.gameplay.respawn`

```java
public interface RespawnController
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `CodecMapCodec<RespawnController>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `CompletableFuture<Void>` | `respawnPlayer(World var1, Ref<EntityStore> var2, ComponentAccessor<EntityStore> var3)` |
