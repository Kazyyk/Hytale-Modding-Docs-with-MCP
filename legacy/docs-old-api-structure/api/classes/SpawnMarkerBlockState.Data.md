---
title: "SpawnMarkerBlockState.Data"
kind: "class"
package: "com.hypixel.hytale.server.spawning.blockstates"
fqcn: "com.hypixel.hytale.server.spawning.blockstates.SpawnMarkerBlockState.Data"
api_surface: true
extends: "StateData"
implements: []
generator_version: "1.0.0"
generated_at: "2026-03-20T20:00:00Z"
tags:
  - "spawning"
  - "block-state"
  - "configuration"
  - "codec"
---

**Package:** `com.hypixel.hytale.server.spawning.blockstates`

```java
public static class SpawnMarkerBlockState.Data extends StateData
```

Configuration data for a [SpawnMarkerBlockState](SpawnMarkerBlockState.md). Loaded from JSON block type definitions, this class specifies which spawn marker asset to use and an optional positional offset for the marker entity relative to the block. Extends `StateData` (the base configuration class for block states).

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `CODEC` | `BuilderCodec<SpawnMarkerBlockState.Data>` | `public static final` | Codec for serializing and deserializing this configuration, extending `StateData.DEFAULT_CODEC`. |

## JSON Configuration Properties

These properties are defined via the codec and read from block type JSON files.

| Property | Type | Required | Description |
|---|---|---|---|
| `SpawnMarker` | `String` | Yes (non-null, validated) | The name of the spawn marker asset to use. Validated against the `SpawnMarker` asset registry. |
| `MarkerOffset` | `Vector3i` | No | An offset from the block position at which the marker entity should be spawned. |

## Methods

```java
public String getSpawnMarker()
```

Returns the spawn marker asset name.

```java
public Vector3i getMarkerOffset()
```

Returns the positional offset for the marker entity, or `null` if no offset is configured.

## Constructor

```java
protected Data()
```

Default constructor. Fields are populated by the codec during deserialization.

## Related Types

- [SpawnMarkerBlockState](SpawnMarkerBlockState.md) -- the runtime block state that uses this configuration
- `StateData` -- base class for block state configuration data
- `Vector3i` -- integer 3D vector used for the marker offset
