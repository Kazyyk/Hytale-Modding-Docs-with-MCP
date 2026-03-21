---
title: "FlockMembershipSystems"
kind: "class"
package: "com.hypixel.hytale.server.flock"
fqcn: "com.hypixel.hytale.server.flock.FlockMembershipSystems"
api_surface: false
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "flock"
  - "ecs"
  - "system"
---

**Package:** `com.hypixel.hytale.server.flock`

```java
public class FlockMembershipSystems
```

Contains the core membership logic for flocks: join/leave processing, leader election, damage tracking, and friendly-fire prevention. The most complex class in the flock package.

## Static Methods

```java
public static boolean canJoinFlock(@Nonnull Ref<EntityStore> reference, @Nonnull Ref<EntityStore> flockReference, @Nonnull Store<EntityStore> store)
```

Checks whether an entity can join a flock: flock data must be loaded, group must not be at max grow size, and the entity's role must be in the allowed roles list.

```java
public static void join(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> flockRef, @Nonnull Store<EntityStore> store)
```

Initiates joining by creating a [FlockMembership](FlockMembership.md) with `JOINING` type and adding it to the entity via `putComponent`.

## Inner Classes

### EntityRef

```java
public static class EntityRef extends RefSystem<EntityStore>
```

Handles entity add/remove for entities with [FlockMembership](FlockMembership.md). On add: resolves the flock UUID to a Ref, creates the flock entity if it does not exist, adds the member to `EntityGroup`, and handles leader assignment from persisted data. On remove with `REMOVE`: leaves the flock and triggers leader re-election. On remove with `UNLOAD`: assigns an interim leader and clears the flock ref.

### RefChange

```java
public static class RefChange extends RefChangeSystem<EntityStore, FlockMembership>
```

Processes [FlockMembership](FlockMembership.md) component add/set/remove events. Validates join conditions: entity must be alive, players must be in Adventure mode, flock data must be loaded, role must be allowed, only one player per flock. On successful join: adds to `EntityGroup`, elects leader (players always become leader), increments size. On leave: removes from group, re-elects leader, dissolves flock if size drops below 2.

### FilterPlayerFlockDamageSystem

```java
public static class FilterPlayerFlockDamageSystem extends DamageEventSystem
```

Cancels damage between flock members -- if the attacker and target are in the same flock, the damage is cancelled (friendly-fire prevention). Query matches players with [FlockMembership](FlockMembership.md).

### OnDamageDealt

```java
public static class OnDamageDealt extends DamageEventSystem
```

Records damage dealt by flock members into the flock's `DamageData`. If the attacker is acting as leader, also records in the leader-specific damage data.

### OnDamageReceived

```java
public static class OnDamageReceived extends DamageEventSystem
```

Records damage received by flock members into the flock's `DamageData`.

### NPCAddedFromWorldGen

```java
public static class NPCAddedFromWorldGen extends HolderSystem<EntityStore>
```

Strips [FlockMembership](FlockMembership.md) from NPCs that arrive from world generation. Prevents stale flock references from persisting across world-gen boundaries.

## Related Types

- [FlockMembership](FlockMembership.md) -- the component these systems process
- [Flock](Flock.md) -- the flock entity component
- [FlockPlugin](FlockPlugin.md) -- registers these systems
