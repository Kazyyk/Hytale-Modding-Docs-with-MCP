---
title: "FlockMembership.Type"
kind: "enum"
package: "com.hypixel.hytale.server.flock"
fqcn: "com.hypixel.hytale.server.flock.FlockMembership.Type"
api_surface: true
extends: ~
implements: []
generator_version: "1.0.0"
generated_at: "2026-03-20T20:00:00Z"
tags:
  - "flock"
  - "npc"
  - "enum"
  - "membership"
---

**Package:** `com.hypixel.hytale.server.flock`

```java
public static enum FlockMembership.Type
```

Defines the membership role of an entity within a flock. Each constant indicates whether the member acts as a leader, which determines behavior delegation in flock AI systems. This enum is an inner type of `FlockMembership`, an ECS component on [Store](Store.md)`<EntityStore>`.

## Constants

| Constant | Acts as Leader | Description |
|---|---|---|
| `JOINING` | `false` | The entity is in the process of joining the flock but is not yet a full member. |
| `MEMBER` | `false` | The entity is a regular flock member with no leadership role. |
| `LEADER` | `true` | The entity is the designated leader of the flock. |
| `INTERIM_LEADER` | `true` | The entity is acting as a temporary leader, likely because the original leader is absent or unavailable. |

## Methods

```java
public boolean isActingAsLeader()
```

Returns `true` if this membership type grants leader behavior (`LEADER` or `INTERIM_LEADER`). Returns `false` for `JOINING` and `MEMBER`.

## Related Types

- [Entity](Entity.md) -- entities that can hold flock membership components
- [Store](Store.md) -- ECS store that holds `FlockMembership` components
- [Ref](Ref.md) -- typed reference used by `FlockMembership` to point to flock entities
- [ComponentType](ComponentType.md) -- type descriptor for the `FlockMembership` component
