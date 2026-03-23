---
title: "FlockMembership"
kind: "class"
package: "com.hypixel.hytale.server.flock"
fqcn: "com.hypixel.hytale.server.flock.FlockMembership"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Component<EntityStore>"
  - "DebugSupport.DebugFlagsChangeListener"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "flock"
  - "ecs"
  - "npc"
---

**Package:** `com.hypixel.hytale.server.flock`

```java
public class FlockMembership implements Component<EntityStore>, DebugSupport.DebugFlagsChangeListener
```

A serialized ECS component attached to individual NPC or player entities that belong to a flock. Links the member to its flock entity via a UUID (persisted) and a runtime [Ref](../com.hypixel.hytale.component/Ref.md) (transient). Tracks the membership type (joining, member, leader, interim leader) and listens for debug flag changes to update the flock's visualization counter.

Serialization ID: `"FlockMembership"`, codec version 5.

## Static Methods

```java
public static ComponentType<EntityStore, FlockMembership> getComponentType()
```

## Methods

```java
public UUID getFlockId()
```

```java
public void setFlockId(UUID flockId)
```

```java
@Nullable
public Ref<EntityStore> getFlockRef()
```

Returns the runtime reference to the flock entity, or `null` if the flock is not loaded.

```java
public void setFlockRef(@Nullable Ref<EntityStore> flockRef)
```

```java
public FlockMembership.Type getMembershipType()
```

```java
public void setMembershipType(FlockMembership.Type membershipType)
```

```java
public void unload()
```

Clears the runtime flock reference. Called when the member is unloaded.

```java
public void registerAsDebugListener(@Nonnull DebugSupport debugSupport, @Nonnull Flock flock)
```

Registers for debug flag change notifications. Increments the flock's `visFlockMemberCount` if the `VisFlock` flag is set.

## Inner Classes

### Type

```java
public static enum Type
```

| Constant | Acts as Leader | Description |
|---|---|---|
| `JOINING` | No | Transitional state during the join process. |
| `MEMBER` | No | Regular flock member. |
| `LEADER` | Yes | Elected flock leader -- owns [PersistentFlockData](PersistentFlockData.md). |
| `INTERIM_LEADER` | Yes | Temporary leader when the actual leader is unloaded. |

```java
public boolean isActingAsLeader()
```

Returns `true` for `LEADER` and `INTERIM_LEADER`.

## Related Types

- [Flock](Flock.md) -- the flock entity component this membership points to
- [FlockMembershipSystems](FlockMembershipSystems.md) -- processes join/leave/damage logic
- [FlockPlugin](FlockPlugin.md) -- registers this component type
