---
title: "PlayerRespawnPointData"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.data"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.data.PlayerRespawnPointData"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.data`

```java
public final class PlayerRespawnPointData
```

Provides PlayerRespawnPointData functionality within the data subsystem.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `Vector3i` | `blockPosition` |
| `private` | `Vector3d` | `respawnPosition` |
| `private` | `String` | `name` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `PlayerRespawnPointData(@Nonnull Vector3i blockPosition, @Nonnull Vector3d respawnPosition, @Nonnull String name)` |
| `private` | | `PlayerRespawnPointData()` |
| `public` | `Vector3i` | `getBlockPosition()` |
| `public` | `Vector3d` | `getRespawnPosition()` |
| `public` | `String` | `getName()` |
| `public` | `void` | `setName(@Nonnull String name)` |
