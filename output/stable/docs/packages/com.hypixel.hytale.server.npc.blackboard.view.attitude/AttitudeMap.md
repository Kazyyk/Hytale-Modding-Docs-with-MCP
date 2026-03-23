---
title: "AttitudeMap"
kind: "class"
package: "com.hypixel.hytale.server.npc.blackboard.view.attitude"
fqcn: "com.hypixel.hytale.server.npc.blackboard.view.attitude.AttitudeMap"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "blackboard"
  - "view"
---

**Package:** `com.hypixel.hytale.server.npc.blackboard.view.attitude`

```java
public class AttitudeMap
```

Provides AttitudeMap functionality within the attitude subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nullable private static final` | `ComponentType<EntityStore, NPCEntity>` | `NPC_COMPONENT_TYPE` | `NPCEntity.getComponentType()` |
| `private static final` | `ComponentType<EntityStore, Player>` | `PLAYER_COMPONENT_TYPE` | `Player.getComponentType()` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Int2ObjectMap<Attitude>[]` | `map` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | | `AttitudeMap(Int2ObjectMap<Attitude>[] map)` |
| `@Nullable public` | `Attitude` | `getAttitude(@Nonnull Role role, @Nonnull Ref<EntityStore> target, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `int` | `getAttitudeGroupCount()` |
| `public` | `void` | `updateAttitudeGroup(int id, @Nonnull AttitudeGroup group)` |
