---
title: "Flock"
kind: "class"
package: "com.hypixel.hytale.server.flock"
fqcn: "com.hypixel.hytale.server.flock.Flock"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "flock"
  - "ecs"
  - "npc"
---

**Package:** `com.hypixel.hytale.server.flock`

```java
public class Flock implements Component<EntityStore>
```

The core ECS component attached to flock entities (not individual members). A flock entity is composed of this component, an `EntityGroup`, and a `UUIDComponent`. Flock holds the group's [PersistentFlockData](PersistentFlockData.md), double-buffered damage tracking for the whole group and leader separately, removal status, and debug visualization state.

The double-buffered `DamageData` system tracks incoming/outgoing damage per tick. Each tick, `swapDamageDataBuffers()` rotates the current and next buffers and resets the next buffer, giving sensors access to the previous tick's damage data.

## Static Methods

```java
public static ComponentType<EntityStore, Flock> getComponentType()
```

Returns the component type, obtained from [FlockPlugin](FlockPlugin.md).

## Constructors

```java
public Flock()
```

Default constructor for deserialization.

```java
public Flock(@Nullable FlockAsset flockDefinition, @Nonnull String[] allowedRoles)
```

Creates a flock with initial [PersistentFlockData](PersistentFlockData.md) derived from the asset and allowed roles.

## Methods

```java
public DamageData getDamageData()
```

Returns the current tick's group damage data (read by sensors).

```java
public DamageData getNextDamageData()
```

Returns the next tick's group damage data (written by damage systems).

```java
public DamageData getLeaderDamageData()
```

Returns the current tick's leader-only damage data.

```java
public DamageData getNextLeaderDamageData()
```

Returns the next tick's leader-only damage data.

```java
public PersistentFlockData getFlockData()
```

```java
public void setFlockData(PersistentFlockData flockData)
```

```java
public Flock.FlockRemovedStatus getRemovedStatus()
```

```java
public void setRemovedStatus(Flock.FlockRemovedStatus status)
```

```java
public boolean isTrace()
```

```java
public void setTrace(boolean trace)
```

Enables trace-level logging for flock operations. Controlled by the `RoleDebugFlags.Flock` flag.

```java
public boolean hasVisFlockMember()
```

Returns `true` if any member has the `VisFlock` debug flag set.

```java
public void onTargetKilled(@Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull Ref<EntityStore> targetEntityReference)
```

Records a kill in the damage tracking. Called by [FlockDeathSystems](FlockDeathSystems.md) when an attacker's flock target dies.

```java
public void swapDamageDataBuffers()
```

Rotates double-buffered damage data. Called each tick by [FlockSystems.Ticking](FlockSystems.md).

## Inner Classes

### FlockRemovedStatus

```java
public static enum FlockRemovedStatus
```

| Constant | Description |
|---|---|
| `NOT_REMOVED` | Flock is active. |
| `DISSOLVED` | Flock was permanently dissolved (all members had FlockMembership removed). |
| `UNLOADED` | Flock was unloaded (members may be restored later). |

## Related Types

- [FlockMembership](FlockMembership.md) -- per-member component linking to the flock
- [PersistentFlockData](PersistentFlockData.md) -- serialized flock metadata
- [FlockPlugin](FlockPlugin.md) -- registers this component type
- [FlockSystems](FlockSystems.md) -- systems operating on flock entities
