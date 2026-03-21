---
title: "MountedByComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountedByComponent"
api_surface: false
extends: ~
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public class MountedByComponent implements Component<EntityStore>
```

An `EntityStore` ECS component that tracks which entities are currently riding a given mount entity. Maintained automatically by [MountSystems.TrackedMounted](MountSystems.TrackedMounted.md) when `MountedComponent` is added or removed from passenger entities.

## Component Type

```java
public static ComponentType<EntityStore, MountedByComponent> getComponentType()
```

Delegates to `MountPlugin.getInstance().getMountedByComponentType()`.

## Methods

### getPassengers

```java
@Nonnull
public List<Ref<EntityStore>> getPassengers()
```

Returns the list of passenger entity references after removing any invalid references.

### addPassenger

```java
public void addPassenger(Ref<EntityStore> passenger)
```

Adds a passenger reference to the list.

### removePassenger

```java
public void removePassenger(Ref<EntityStore> ref)
```

Removes a passenger reference from the list.

### withPassenger

```java
@Nonnull
public MountedByComponent withPassenger(Ref<EntityStore> passenger)
```

Fluent variant of `addPassenger` that returns `this`.

### removeInvalid

```java
public void removeInvalid()
```

Removes all invalid (stale) references from the passenger list.

## Clone

```java
@Nonnull
@Override
public Component<EntityStore> clone()
```

Returns a new empty `MountedByComponent`. Passengers are not copied.

## Related Types

- [MountedComponent](MountedComponent.md) -- the component on passenger entities
- [MountSystems.TrackedMounted](MountSystems.TrackedMounted.md) -- system maintaining this component
- [MountSystems.RemoveMountedBy](MountSystems.RemoveMountedBy.md) -- dismounts passengers on mount removal
