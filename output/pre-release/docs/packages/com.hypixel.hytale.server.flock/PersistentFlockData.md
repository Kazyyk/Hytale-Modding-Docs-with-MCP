---
title: "PersistentFlockData"
kind: "class"
package: "com.hypixel.hytale.server.flock"
fqcn: "com.hypixel.hytale.server.flock.PersistentFlockData"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "flock"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.flock`

```java
public class PersistentFlockData implements Component<EntityStore>
```

Serialized flock metadata stored on the leader NPC entity for chunk persistence and on the [Flock](Flock.md) entity at runtime. Tracks maximum grow size, allowed roles (sorted for binary search), and current flock size.

Serialization ID: `"FlockData"`.

## Static Methods

```java
public static ComponentType<EntityStore, PersistentFlockData> getComponentType()
```

## Constructors

```java
public PersistentFlockData(@Nullable FlockAsset flockDefinition, @Nonnull String[] allowedRoles)
```

Initializes from a [FlockAsset](FlockAsset.md) and allowed roles. Blocked roles from the asset are removed from the allowed list.

## Methods

```java
public int getMaxGrowSize()
```

```java
public boolean isFlockAllowedRole(String role)
```

Uses binary search on the sorted allowed roles array.

```java
public void increaseSize()
```

```java
public void decreaseSize()
```

## Related Types

- [Flock](Flock.md) -- holds this data at runtime
- [FlockAsset](FlockAsset.md) -- provides max grow size and blocked roles
- [FlockMembershipSystems](FlockMembershipSystems.md) -- reads this data for join validation
