---
title: "WorldSupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support.WorldSupport"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "world"
  - "attitude"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

```java
public class WorldSupport
```

World-interaction support for NPC roles. Manages the attitude system (default player/NPC attitudes, attitude group lookups, attitude override memory with TTL), block sensor cached targets, search ray cached positions, block placement state, environment ID caching, and weather index caching. The attitude cache clears every 100ms.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double` | `ATTITUDE_CACHE_CLEAR_FREQUENCY` | `0.1` |

## Constructors

| Signature |
|---|
| `public WorldSupport(NPCEntity parent, @Nonnull BuilderRole builder, @Nonnull BuilderSupport support)` |

## Attitude Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Attitude` | `getDefaultPlayerAttitude()` |
| `public` | `Attitude` | `getDefaultNPCAttitude()` |
| `public` | `int` | `getAttitudeGroup()` |
| `public` | `int` | `getItemAttitudeGroup()` |
| `@Nonnull public` | `Attitude` | `getAttitude(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Nullable public` | `Attitude` | `getItemAttitude(@Nullable ItemStack item)` |
| `public` | `void` | `overrideAttitude(Ref<EntityStore> target, Attitude attitude, double duration)` |
| `@Nullable public` | `Attitude` | `getOverriddenAttitude(Ref<EntityStore> target)` |
| `public` | `void` | `requireAttitudeCache()` |

## Block Sensor Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `BlockTarget` | `getCachedBlockTarget(int blockSet)` |
| `public` | `void` | `resetBlockSensorFoundBlock(int blockSet)` |
| `public` | `void` | `resetAllBlockSensors()` |

## Search Ray Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Vector3d` | `getCachedSearchRayPosition(int id)` |
| `public` | `void` | `resetCachedSearchRayPosition(int id)` |
| `public` | `void` | `resetAllCachedSearchRayPositions()` |

## Environment/Weather Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getEnvironmentId(@Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `int` | `getCurrentWeatherIndex(@Nonnull ComponentAccessor<EntityStore> componentAccessor)` |

## Static Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `boolean` | `hasTagInGroup(int group, int tag)` |
| `public static` | `boolean` | `isGroupMember(int parentRoleIndex, @Nonnull Ref<EntityStore> ref, @Nullable int[] groups, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public static` | `boolean` | `isGroupMember(int parentRoleIndex, @Nullable Ref<EntityStore> ref, int group, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public static` | `int[]` | `createTagSetIndexArray(@Nullable String[] tagSets)` |

## Related Types

- [CombatSupport](CombatSupport.md) -- uses `isGroupMember` for damage group filtering
