---
title: "FlockPlugin"
kind: "class"
package: "com.hypixel.hytale.server.flock"
fqcn: "com.hypixel.hytale.server.flock.FlockPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "flock"
  - "plugin"
  - "npc"
---

**Package:** `com.hypixel.hytale.server.flock`

```java
public class FlockPlugin extends JavaPlugin
```

Central plugin for the flock/group behavior system. Registers all ECS components ([Flock](Flock.md), [FlockMembership](FlockMembership.md), [PersistentFlockData](PersistentFlockData.md)), systems ([FlockSystems](FlockSystems.md), [FlockMembershipSystems](FlockMembershipSystems.md), [FlockDeathSystems](FlockDeathSystems.md)), the [FlockAsset](FlockAsset.md) store, 10 NPC core component types for AI integration, and the `FlockSize` decision-maker condition.

## Static Methods

```java
public static FlockPlugin get()
```

Returns the singleton instance.

```java
@Nullable
public static Ref<EntityStore> trySpawnFlock(@Nonnull Ref<EntityStore> npcRef, @Nonnull NPCEntity npc, @Nonnull Store<EntityStore> store, int roleIndex, @Nonnull Vector3d position, Vector3f rotation, @Nullable FlockAsset flockDefinition, TriConsumer<NPCEntity, Ref<EntityStore>, Store<EntityStore>> postSpawn)
```

Attempts to spawn a flock of NPCs around a leader. Picks the flock size from the [FlockAsset](FlockAsset.md), creates a flock entity, joins the leader, then spawns additional members at randomized positions around the leader. Each member is spawned via `NPCPlugin.spawnEntity()` and joined to the flock.

```java
@Nonnull
public static Ref<EntityStore> createFlock(@Nonnull Store<EntityStore> store, @Nullable FlockAsset flockDefinition, @Nonnull String[] allowedRoles)
```

Creates a new flock entity with `UUIDComponent`, `EntityGroup`, and [Flock](Flock.md) components.

```java
@Nullable
public static Ref<EntityStore> getFlockReference(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
```

Returns the flock entity reference for a member, or `null` if not in a flock.

```java
public static boolean isFlockMember(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)
```

Returns `true` if the entity has a [FlockMembership](FlockMembership.md) component.

```java
@Nullable
@Deprecated
public static Flock getFlock(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> reference)
```

Deprecated -- returns the [Flock](Flock.md) component for a member's flock entity.

## Instance Methods

```java
public ComponentType<EntityStore, Flock> getFlockComponentType()
```

```java
public ComponentType<EntityStore, FlockMembership> getFlockMembershipComponentType()
```

```java
public ComponentType<EntityStore, PersistentFlockData> getPersistentFlockDataComponentType()
```

```java
@Nonnull
public UUID getPrefabRemappedFlockReference(int prefabId, UUID oldId)
```

Returns a remapped UUID for flock references during prefab paste operations.

## Registered NPC Core Component Types

| NPC Type | Builder | Runtime | Category |
|---|---|---|---|
| `Flock` | `BuilderBodyMotionFlock` | `BodyMotionFlock` | BodyMotion |
| `JoinFlock` | `BuilderActionFlockJoin` | `ActionFlockJoin` | Action |
| `LeaveFlock` | `BuilderActionFlockLeave` | `ActionFlockLeave` | Action |
| `FlockState` | `BuilderActionFlockState` | `ActionFlockState` | Action |
| `FlockTarget` | `BuilderActionFlockSetTarget` | `ActionFlockSetTarget` | Action |
| `FlockBeacon` | `BuilderActionFlockBeacon` | `ActionFlockBeacon` | Action |
| `Flock` | `BuilderEntityFilterFlock` | `EntityFilterFlock` | EntityFilter |
| `FlockCombatDamage` | `BuilderSensorFlockCombatDamage` | `SensorFlockCombatDamage` | Sensor |
| `InflictedDamage` | `BuilderSensorInflictedDamage` | `SensorInflictedDamage` | Sensor |
| `FlockLeader` | `BuilderSensorFlockLeader` | `SensorFlockLeader` | Sensor |

## Related Types

- [Flock](Flock.md) -- core flock entity component
- [FlockMembership](FlockMembership.md) -- per-member component
- [PersistentFlockData](PersistentFlockData.md) -- serialized flock metadata
- [FlockAsset](FlockAsset.md) -- JSON configuration for flock definitions
- [FlockSystems](FlockSystems.md) -- flock entity lifecycle systems
- [FlockMembershipSystems](FlockMembershipSystems.md) -- membership processing systems
