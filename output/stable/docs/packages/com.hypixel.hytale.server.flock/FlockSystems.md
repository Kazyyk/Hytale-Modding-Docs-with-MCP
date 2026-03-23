---
title: "FlockSystems"
kind: "class"
package: "com.hypixel.hytale.server.flock"
fqcn: "com.hypixel.hytale.server.flock.FlockSystems"
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
public class FlockSystems
```

Container for ECS systems that operate on flock entities. Contains four inner system classes registered by [FlockPlugin](FlockPlugin.md).

## Inner Classes

### EntityRemoved

```java
public static class EntityRemoved extends RefSystem<EntityStore>
```

Handles flock entity removal. On `REMOVE`: dissolves the group by removing [FlockMembership](FlockMembership.md) from all members, marking chunks dirty, and clearing the `EntityGroup`. On `UNLOAD`: clears the group without dissolving. Query matches entities with `UUIDComponent`, `EntityGroup`, and [Flock](Flock.md).

### Ticking

```java
public static class Ticking extends EntityTickingSystem<EntityStore>
```

Swaps the double-buffered damage data each tick via `Flock.swapDamageDataBuffers()`. Supports parallel execution. Query matches entities with the [Flock](Flock.md) component.

### FlockDebugSystem

```java
public static class FlockDebugSystem extends EntityTickingSystem<EntityStore>
```

Renders debug visualization when any flock member has the `VisFlock` debug flag set. Draws colored rings around members and lines connecting members to the leader. Ring colors are derived from the flock UUID. Only active when `Flock.hasVisFlockMember()` returns `true`.

### PlayerChangeGameModeEventSystem

```java
public static class PlayerChangeGameModeEventSystem extends EntityEventSystem<EntityStore, ChangeGameModeEvent>
```

Removes [FlockMembership](FlockMembership.md) when a player switches to a non-Adventure game mode.

## Related Types

- [Flock](Flock.md) -- the component these systems operate on
- [FlockPlugin](FlockPlugin.md) -- registers these systems
