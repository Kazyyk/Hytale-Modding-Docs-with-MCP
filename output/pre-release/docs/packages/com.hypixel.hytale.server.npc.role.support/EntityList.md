---
title: "EntityList"
kind: "class"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support.EntityList"
api_surface: false
extends: "com.hypixel.hytale.common.collection.BucketList"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "spatial"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

```java
public class EntityList extends BucketList<Ref<EntityStore>>
```

Distance-bucketed entity list used by [PositionCache](PositionCache.md) for efficient spatial queries over nearby players and NPCs. Entities are organized into 6 buckets based on squared distance. Supports three distance categories -- sorted, unsorted, and avoidance -- each with independent maximum ranges. After configuration is finalized, buckets are set up with pre-sorted boundary arrays.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `protected static final` | `int` | `BUCKET_COUNT` | `6` |
| `protected static final` | `int` | `BUCKET_DISTANCE_NEAR` | `5` |
| `protected static final` | `int` | `BUCKET_DISTANCE_NEARER` | `3` |

## Constructors

| Signature |
|---|
| `public EntityList(@Nullable BucketItemPool<Ref<EntityStore>> holderPool, @Nonnull BiPredicate<Ref<EntityStore>, ComponentAccessor<EntityStore>> validator)` |

## Configuration Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `requireDistanceSorted(int value)` |
| `public` | `int` | `requireDistanceUnsorted(int value)` |
| `public` | `int` | `requireDistanceAvoidance(int value)` |
| `public` | `void` | `finalizeConfiguration()` |

## Query Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `Ref<EntityStore>` | `getClosestEntityInRange(double minRange, double maxRange, @Nonnull Predicate<Ref<EntityStore>> filter, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Nullable public` | `Ref<EntityStore>` | `getClosestEntityInRange(@Nullable Ref<EntityStore> ignoredEntityReference, double minRange, double maxRange, ...)` |
| `@Nullable public` | `Ref<EntityStore>` | `getClosestEntityInRangeProjected(@Nonnull Ref<EntityStore> parentRef, ...)` |
| `public` | `int` | `countEntitiesInRange(double minRange, double maxRange, int maxCount, ...)` |
| `public` | `boolean` | `testAnyEntity(double maxDistance, ...)` |
| `public` | `boolean` | `testAnyEntityDistanceSquared(double maxDistanceSquared, ...)` |

## Iteration Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `forEachEntity(...)` |
| `public` | `void` | `forEachEntityUnordered(double maxDistance, ...)` |
| `public` | `void` | `forEachEntityAvoidance(@Nonnull Set<Ref<EntityStore>> ignoredEntitiesForAvoidance, ...)` |

## Accessors

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getMaxDistanceUnsorted()` |
| `public` | `int` | `getMaxDistanceSorted()` |
| `public` | `int` | `getMaxDistanceAvoidance()` |
| `public` | `int` | `getSearchRadius()` |
| `public` | `IntArrayList` | `getBucketRanges()` |

## Related Types

- [PositionCache](PositionCache.md) -- owns player and NPC entity lists
