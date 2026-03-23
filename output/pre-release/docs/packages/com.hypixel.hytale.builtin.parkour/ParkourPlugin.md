---
title: "ParkourPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.parkour"
fqcn: "com.hypixel.hytale.builtin.parkour.ParkourPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "parkour"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.parkour`

```java
public class ParkourPlugin extends JavaPlugin
```

Plugin class that registers components, systems, and commands for the parkour subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `String` | `PARKOUR_CHECKPOINT_MODEL_ID` | `"Objective_Location_Marker"` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `ComponentType<EntityStore, ParkourCheckpoint>` | `parkourCheckpointComponentType` |
| `private` | `Model` | `parkourCheckpointModel` |
| `private` | `int` | `lastIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public static ParkourPlugin` | `get()` |
| `` | `` | `super(init)` |
| `` | `public ComponentType<EntityStore, ParkourCheckpoint>` | `getParkourCheckpointComponentType()` |
| `` | `public Model` | `getParkourCheckpointModel()` |
| `` | `public Object2IntMap<UUID>` | `getCurrentCheckpointByPlayerMap()` |
| `` | `public Object2LongMap<UUID>` | `getStartTimeByPlayerMap()` |
| `` | `public Int2ObjectMap<UUID>` | `getCheckpointUUIDMap()` |
| `` | `public int` | `getLastIndex()` |
| `@Override protected` | `void` | `setup()` |
| `@Override protected` | `void` | `start()` |
| `` | `public void` | `updateLastIndex(int index)` |
| `` | `public void` | `updateLastIndex()` |
| `` | `public void` | `resetPlayer(UUID playerUuid)` |
