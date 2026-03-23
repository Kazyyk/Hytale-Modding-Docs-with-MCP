---
title: "FlockDeathSystems"
kind: "class"
package: "com.hypixel.hytale.server.flock"
fqcn: "com.hypixel.hytale.server.flock.FlockDeathSystems"
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
public class FlockDeathSystems
```

ECS systems that handle flock membership changes on entity death.

## Inner Classes

### EntityDeath

```java
public static class EntityDeath extends DeathSystems.OnDeathSystem
```

Fires when a non-player living entity dies. Removes [FlockMembership](FlockMembership.md) unless `Role.isCorpseStaysInFlock()` is `true`. Also notifies the attacker's flock of the kill via `Flock.onTargetKilled()`.

### PlayerDeath

```java
public static class PlayerDeath extends DeathSystems.OnDeathSystem
```

Fires when a player dies. Removes [FlockMembership](FlockMembership.md) unconditionally.

## Related Types

- [FlockMembership](FlockMembership.md) -- removed on death
- [Flock](Flock.md) -- receives kill notifications
