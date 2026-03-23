---
title: "NPC Spawn Schema"
kind: "schema"
asset_type: "NPCSpawn"
package: "com.hypixel.hytale.server.spawning.assets.spawns.config"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - "schemas"
  - "json"
  - "npc"
  - "spawning"
  - "asset"
---

> Class: `com.hypixel.hytale.server.spawning.assets.spawns.config.NPCSpawn`
> Codec: `BuilderCodec<NPCSpawn>` (abstract, via `AssetBuilderCodec.abstractBuilder`)

NPC spawn definitions control which NPCs can spawn, under what environmental conditions (time of day, moon phase, light levels), and how they despawn. `NPCSpawn` is an abstract class; the base codec (`BASE_CODEC`) defines the shared fields documented here. Subclasses extend this codec for specific spawn mechanisms. Most fields use `appendInherited`, enabling asset pack inheritance chains.

## Schema Fields

### Spawn Configuration

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `NPCs` | `RoleSpawnParameters[]` | `array of objects` | yes | -- | A required list of role spawn parameters defining each NPC that can be spawned and their relative weights. Must be non-null and non-empty. See RoleSpawnParameters sub-schema below. |
| `Despawn` | `DespawnParameters` | `object` | no | `null` | Optional despawn parameters to control NPC despawning. See DespawnParameters sub-schema below. |

### Time & Phase Conditions

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `DayTimeRange` | `double[]` | `array of 2 numbers` | no | `[0.0, Double.MAX_VALUE]` | Hour range within which the NPCs will spawn (between 0 and 24). Default is unbounded (always spawns). Values are divided by 24 internally to normalize to a 0-1 range. Must contain exactly 2 elements, both >= 0. |
| `MoonPhaseRange` | `int[]` | `array of 2 integers` | no | `[0, Integer.MAX_VALUE]` | Moon phase range during which the NPCs will spawn. Default is unbounded (all phases). Must contain exactly 2 elements, both >= 0. |
| `ScaleDayTimeRange` | `Boolean` | `boolean` | no | `true` | If true, instead of using absolute hour values for DayTimeRange, it will be scaled based on the world's DaytimePortion. 0 and 24 represent the middle of the night portion. 6 represents sunrise. 12 represents the middle of the day portion. 18 represents sunset. |

### Light Conditions

| JSON Key | Java Type | JSON Type | Required | Default | Description |
|----------|-----------|-----------|----------|---------|-------------|
| `LightRanges` | `Map<LightType, double[]>` | `object` (enum keys -> arrays of numbers) | no | `null` | Optional light ranges to constrain spawning, defined between 0 and 100. Values must be weakly monotonic. When absent, the full range `[0, 100]` is used for all light types. Keys are `LightType` enum values (see below). |

#### LightType Enum Values

| Value | Description |
|-------|-------------|
| `Light` | Total light level. |
| `SkyLight` | Light level based on how deep under cover the position is relative to the open sky (e.g., inside a cave will be low SkyLight). |
| `Sunlight` | Light level based on time of day (peaks at around noon and is 0 during most of the night). |
| `RedLight` | Red light level. |
| `GreenLight` | Green light level. |
| `BlueLight` | Blue light level. |

## RoleSpawnParameters Sub-Schema

Each entry in the `NPCs` array is a `RoleSpawnParameters` object defining a single NPC type and its spawn configuration:

| JSON Key | Java Type | JSON Type | Required | Description |
|----------|-----------|-----------|----------|-------------|
| `Id` | `String` | `string` | yes | The Role ID of the NPC to spawn. Must be non-null and pass NPCRoleValidator. |
| `Weight` | `Double` | `number` (>0) | yes | The relative weight of this NPC. Chance of being spawned is this value relative to the sum of all weights. Must be greater than 0. |
| `SpawnBlockSet` | `String` | `string` | no | An optional BlockSet reference that defines which blocks this NPC can spawn on. |
| `SpawnFluidTag` | `String` | `string` | no | An optional tag reference that defines which fluids this NPC can spawn on. |
| `Flock` | `String` | `string` | no | The optional flock definition to spawn around this NPC. References a FlockAsset. |

## DespawnParameters Sub-Schema

The `Despawn` field is a `DespawnParameters` object that controls when spawned NPCs should despawn:

| JSON Key | Java Type | JSON Type | Required | Description |
|----------|-----------|-----------|----------|-------------|
| `DayTimeRange` | `double[]` | `array of 2 numbers` | no | Hour range within which NPCs will despawn (between 0 and 24). For spawn beacons, this refers to the beacon itself. Values are divided by 24 internally. Must contain exactly 2 elements, both >= 0. |
| `MoonPhaseRange` | `int[]` | `array of 2 integers` | no | Moon phase range during which NPCs will despawn. For spawn beacons, this refers to the beacon itself. Must contain exactly 2 elements, both >= 0. |

## Validation Rules

The codec enforces these validation constraints:

- `DayTimeRange` values must be >= 0
- `MoonPhaseRange` values must be >= 0
- All light range values must be between 0 and 100 (inclusive)
- Light range arrays must be weakly monotonic (each value >= the previous)
- Despawn `DayTimeRange` and `MoonPhaseRange` follow the same >= 0 constraint
- `NPCs` must be non-null and non-empty

## Example

```json
{
  "NPCs": [
    {
      "Id": "Skeleton_Warrior",
      "Weight": 3.0,
      "SpawnBlockSet": "Overworld_Surface"
    },
    {
      "Id": "Skeleton_Archer",
      "Weight": 1.0
    }
  ],
  "Despawn": {
    "DayTimeRange": [6.0, 18.0]
  },
  "DayTimeRange": [20.0, 4.0],
  "MoonPhaseRange": [0, 7],
  "LightRanges": {
    "Light": [0.0, 40.0],
    "SkyLight": [0.0, 50.0]
  },
  "ScaleDayTimeRange": true
}
```

This example spawns skeletons at night (hours 20-4), despawns them during the day (hours 6-18), only in low-light conditions, with warriors weighted 3:1 over archers.

## Related

- **[JSON Asset Schemas Overview](index.md)** -- BuilderCodec pattern documentation
- **[Item Schema](item.md)** -- Item asset definitions
