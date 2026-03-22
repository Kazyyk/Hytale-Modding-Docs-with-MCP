---
title: "OverrideNearbyRespawnPointPage"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.respawn"
fqcn: "com.hypixel.hytale.builtin.beds.respawn.OverrideNearbyRespawnPointPage"
api_surface: false
extends: "RespawnPointPage"
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
public class OverrideNearbyRespawnPointPage extends RespawnPointPage
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String` | `PAGE_OVERRIDE_NEARBY_SPAWN_POINT_PAGE` |
| `private final` | `Vector3i` | `respawnPointPosition` |
| `private final` | `RespawnBlock` | `respawnPointToAdd` |
| `private final` | `PlayerRespawnPointData[]` | `nearbyRespawnPoints` |
| `private final` | `int` | `radiusLimitRespawnPoint` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `OverrideNearbyRespawnPointPage( @Nonnull PlayerRef playerRef, @Nonnull InteractionType interactionType, @Nonnull Vector3i respawnPointPosition, @Nonnull RespawnBlock respawnPointToAdd, @Nonnull PlayerRespawnPointData[] nearbyRespawnPoints, int radiusLimitRespawnPoint )` |
| `public` | `void` | `build( @Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store )` |
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull RespawnPointPage.RespawnPointEventData data)` |
