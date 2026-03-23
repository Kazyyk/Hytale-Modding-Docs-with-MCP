---
title: "BlackboardSystems"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.BlackboardSystems"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "blackboard"
  - "event-system"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class BlackboardSystems
```

Container class for four ECS systems that manage the shared `Blackboard` resource. The Blackboard provides structured world-state views (block types, events, attitudes, resources, interactions) to NPC sensors.

## Inner Systems

### BlackboardSystems.InitSystem

```java
public static class InitSystem extends StoreSystem<EntityStore>
```

Initializes and tears down the `Blackboard` resource when the system is added to or removed from the store.

```java
@Override
public void onSystemAddedToStore(@Nonnull Store<EntityStore> store)
```

Calls `Blackboard.init(world)` to set up all blackboard views for the world.

```java
@Override
public void onSystemRemovedFromStore(@Nonnull Store<EntityStore> store)
```

Calls `Blackboard.onWorldRemoved()` to clean up all views.

### BlackboardSystems.TickingSystem

```java
public static class TickingSystem extends DelayedSystem<EntityStore>
```

Periodically cleans up stale blackboard view data. Runs every 5 seconds (`SYSTEM_INTERVAL = 5.0F`).

```java
@Override
public void delayedTick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)
```

Calls `Blackboard.cleanupViews()`.

### BlackboardSystems.BreakBlockEventSystem

```java
public static class BreakBlockEventSystem extends EntityEventSystem<EntityStore, BreakBlockEvent>
```

Forwards `BreakBlockEvent` ECS events to the blackboard. Calls `Blackboard.onEntityBreakBlock(ref, event)`.

### BlackboardSystems.DamageBlockEventSystem

```java
public static class DamageBlockEventSystem extends EntityEventSystem<EntityStore, DamageBlockEvent>
```

Forwards `DamageBlockEvent` ECS events to the blackboard. Calls `Blackboard.onEntityDamageBlock(ref, event)`.

## Related Types

- [RoleSystems](RoleSystems.md) -- uses blackboard data during behavior ticks
- [PositionCacheSystems](PositionCacheSystems.md) -- spatial queries that complement blackboard views
