---
title: "SpawnMarkerBlockState"
kind: "class"
package: "com.hypixel.hytale.server.spawning.blockstates"
fqcn: "com.hypixel.hytale.server.spawning.blockstates.SpawnMarkerBlockState"
api_surface: true
extends: "BlockState"
implements: []
generator_version: "1.0.0"
generated_at: "2026-03-20T20:00:00Z"
tags:
  - "spawning"
  - "block-state"
  - "marker"
---

**Package:** `com.hypixel.hytale.server.spawning.blockstates`

```java
public class SpawnMarkerBlockState extends BlockState
```

A block state that associates a block with a spawn marker entity. Extends `BlockState` to track a `PersistentRef` to the marker entity and a timeout for detecting when the marker entity is lost. The spawn system uses this state to manage entity spawning tied to specific block positions.

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `CODEC` | `Codec<SpawnMarkerBlockState>` | `public static final` | Codec for serializing and deserializing this block state, extending `BlockState.BASE_CODEC`. |

## Methods

### Marker Reference

```java
public PersistentRef getSpawnMarkerReference()
```

Returns the `PersistentRef` pointing to the associated spawn marker entity.

```java
public void setSpawnMarkerReference(PersistentRef spawnMarkerReference)
```

Sets the persistent reference to the spawn marker entity.

### Marker Lost Timeout

```java
public void refreshMarkerLostTimeout()
```

Resets the marker-lost timeout to its default value of 30 seconds. Called when the spawn system confirms the marker entity is still alive.

```java
public boolean tickMarkerLostTimeout(float dt)
```

Decrements the marker-lost timeout by `dt` seconds. Returns `true` if the timeout has elapsed (the marker entity is considered lost), `false` otherwise.

## Inner Classes

- [SpawnMarkerBlockState.Data](SpawnMarkerBlockState.Data.md) -- configuration data for this block state, including the spawn marker asset name and optional offset

## Related Types

- [SpawnMarkerBlockState.Data](SpawnMarkerBlockState.Data.md) -- the configuration data class for this block state
- `BlockState` -- the base class for all block states
- `PersistentRef` -- persistent entity reference that survives save/load cycles
