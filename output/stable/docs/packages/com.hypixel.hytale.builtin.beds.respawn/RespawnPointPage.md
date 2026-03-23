---
title: "RespawnPointPage"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.respawn"
fqcn: "com.hypixel.hytale.builtin.beds.respawn.RespawnPointPage"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "beds"
---
**Package:** `com.hypixel.hytale.builtin.beds.respawn`

```java
public abstract class RespawnPointPage extends InteractiveCustomUIPage<RespawnPointPage.RespawnPointEventData>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `int` | `RESPAWN_NAME_MAX_LENGTH` |
| `private` | `String` | `action` |
| `private` | `String` | `indexStr` |
| `private` | `int` | `index` |
| `private` | `String` | `respawnPointName` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `RespawnPointPage(@Nonnull PlayerRef playerRef, @Nonnull InteractionType interactionType)` |
| `public abstract` | `void` | `build(@Nonnull Ref<EntityStore> var1, @Nonnull UICommandBuilder var2, @Nonnull UIEventBuilder var3, @Nonnull Store<EntityStore> var4)` |
| `protected` | `void` | `setRespawnPointForPlayer( @Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull Vector3i blockPosition, @Nonnull RespawnBlock respawnBlock, @Nonnull String respawnPointName, @Nullable PlayerRespawnPointData... respawnPointsToRemove )` |
| `private static` | `PlayerRespawnPointData[]` | `handleRespawnPointsToRemove( @Nonnull World world, @Nonnull PlayerRespawnPointData[] respawnPoints, @Nullable PlayerRespawnPointData[] respawnPointsToRemove )` |
| `protected` | `void` | `displayError(@Nonnull Message errorMessage)` |
| `public` | `String` | `getAction()` |
| `public` | `int` | `getIndex()` |
| `public` | `String` | `getRespawnPointName()` |
