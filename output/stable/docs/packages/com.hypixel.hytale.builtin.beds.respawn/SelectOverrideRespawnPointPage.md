---
title: "SelectOverrideRespawnPointPage"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.respawn"
fqcn: "com.hypixel.hytale.builtin.beds.respawn.SelectOverrideRespawnPointPage"
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
public class SelectOverrideRespawnPointPage extends RespawnPointPage
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `String` | `PAGE_SELECT_OVERRIDE_RESPAWN_POINT_PAGE` |
| `private final` | `Vector3i` | `respawnPointToAddPosition` |
| `private final` | `RespawnBlock` | `respawnPointToAdd` |
| `private final` | `PlayerRespawnPointData[]` | `respawnPoints` |
| `private` | `int` | `selectedRespawnPointIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `SelectOverrideRespawnPointPage( @Nonnull PlayerRef playerRef, @Nonnull InteractionType interactionType, @Nonnull Vector3i respawnPointToAddPosition, @Nonnull RespawnBlock respawnPointToAdd, @Nonnull PlayerRespawnPointData[] respawnPoints )` |
| `public` | `void` | `build( @Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store )` |
| `public` | `void` | `handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull RespawnPointPage.RespawnPointEventData data)` |
| `private` | `void` | `setSelectedRespawnPoint(@Nonnull RespawnPointPage.RespawnPointEventData data)` |
