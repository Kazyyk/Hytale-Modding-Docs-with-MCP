---
title: "PlayerWorldData"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.data"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.data.PlayerWorldData"
api_surface: true
extends: null
implements: ["UserMapMarkersStore"]
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
public final class PlayerWorldData implements UserMapMarkersStore
```

Implements `UserMapMarkersStore` to provide PlayerWorldData functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `int` | `DEATH_POSITIONS_COUNT_MAX` | `5` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private transient` | `PlayerConfigData` | `playerConfigData` |  |
| `private` | `Transform` | `lastPosition` |  |
| `private` | `SavedMovementStates` | `lastMovementStates` |  |
| `private` | `Map<String, UserMapMarker>` | `mapMarkersById` | `new ConcurrentHashMap<>()` |
| `private` | `boolean` | `firstSpawn` | `true` |
| `@Nullable private` | `PlayerRespawnPointData[]` | `respawnPoints` |  |
| `@Nonnull private` | `List<PlayerDeathPositionData>` | `deathPositions` | `new ObjectArrayList()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | | `PlayerWorldData()` |
| `public` | `void` | `setPlayerConfigData(@Nonnull PlayerConfigData playerConfigData)` |
| `public` | `Transform` | `getLastPosition()` |
| `public` | `void` | `setLastPosition(@Nonnull Transform lastPosition)` |
| `public` | `SavedMovementStates` | `getLastMovementStates()` |
| `public` | `void` | `setLastMovementStates(@Nonnull MovementStates lastMovementStates, boolean save)` |
| `private` | `void` | `setLastMovementStates_internal(@Nonnull MovementStates lastMovementStates)` |
| `@Nonnull @Override public` | `Collection<? extends UserMapMarker>` | `getUserMapMarkers()` |
| `@Override public` | `Collection<? extends UserMapMarker>` | `getUserMapMarkers(UUID placedByUuid)` |
| `@Override public` | `void` | `setUserMapMarkers(@Nullable Collection<? extends UserMapMarker> markers)` |
| `@Nullable @Override public` | `UserMapMarker` | `getUserMapMarker(String markerId)` |
| `public` | `boolean` | `isFirstSpawn()` |
| `public` | `void` | `setFirstSpawn(boolean firstSpawn)` |
| `@Nullable public` | `PlayerRespawnPointData[]` | `getRespawnPoints()` |
| `public` | `void` | `setRespawnPoints(@Nonnull PlayerRespawnPointData[] respawnPoints)` |
| `@Nonnull public` | `List<PlayerDeathPositionData>` | `getDeathPositions()` |
| `public` | `void` | `addLastDeath(@Nonnull String markerId, @Nonnull Transform transform, int deathDay)` |
| `public` | `boolean` | `removeLastDeath(@Nonnull String markerId)` |
