---
title: "NPCObjectivesPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.NPCObjectivesPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives`

```java
public class NPCObjectivesPlugin extends JavaPlugin
```

Plugin that registers systems, assets for the adventure subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `instance` | `NPCObjectivesPlugin` | Static NPCObjectivesPlugin field. |
| `killTrackerResourceType` | `ResourceType<EntityStore, KillTrackerResource>` | ResourceType<EntityStore, KillTrackerResource> field. |

## Constructors

| Constructor | Description |
|---|---|
| `NPCObjectivesPlugin(@Nonnull JavaPluginInit init)` | Creates a new NPCObjectivesPlugin instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `NPCObjectivesPlugin` | static public method. |
| `setup()` | `void` | protected method. |
| `hasTask(@Nonnull UUID playerUUID, @Nonnull UUID npcId, @Nonnull String taskId)` | `boolean` | static public method. |
| `startObjective(@Nonnull Ref<EntityStore> playerRef, @Nonnull String taskId, @Nonnull Store<EntityStore> store)` | `void` | static public method. |
| `getKillTrackerResourceType()` | `ResourceType<EntityStore, KillTrackerResource>` | public method. |
