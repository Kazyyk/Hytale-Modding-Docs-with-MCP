---
title: "PlayerDeathPositionData"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.data"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.data.PlayerDeathPositionData"
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
public final class PlayerDeathPositionData
```

Provides PlayerDeathPositionData functionality within the data subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull public static final` | `ArrayCodec<PlayerDeathPositionData>` | `ARRAY_CODEC` | `new ArrayCodec<>(CODEC, PlayerDeathPositionData[]::new)` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `String` | `markerId` |
| `private` | `Transform` | `transform` |
| `private` | `int` | `day` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | | `PlayerDeathPositionData()` |
| `public` | | `PlayerDeathPositionData(@Nonnull String markerId, @Nonnull Transform transform, int day)` |
| `public` | `String` | `getMarkerId()` |
| `public` | `Transform` | `getTransform()` |
| `public` | `int` | `getDay()` |
