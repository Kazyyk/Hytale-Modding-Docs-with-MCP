---
title: Ref
kind: class
package: com.hypixel.hytale.component
api_surface: true
extends: ~
generator_version: "1.0.0"
generated_at: "2026-02-09T23:30:00Z"
tags:
  - ecs
  - entity
  - reference
  - identity
---

**Package:** `com.hypixel.hytale.component`

```java
public class Ref<ECS_TYPE>
```

A lightweight handle that identifies an entity within a [Store](Store.md). Every entity in the ECS is referenced by a `Ref` rather than by a direct pointer to its data. This indirection allows the store to relocate entity data between archetype chunks without invalidating external references -- the `Ref` remains stable while the underlying storage layout changes.

## Static Fields

```java
public static final Ref<?>[] EMPTY_ARRAY = new Ref[0]
```

Shared empty array constant. Used by internal APIs to avoid allocating empty arrays.

## Fields

```java
@Nonnull
private final Store<ECS_TYPE> store
```

The store that owns this entity. A `Ref` is permanently bound to a single store -- it cannot be used to access entities in a different store.

```java
private volatile int index
```

The entity's current slot in the store's internal data structure. This field is `volatile` because it can be set to `Integer.MIN_VALUE` from a thread other than the store's owning thread when the entity is removed asynchronously.

## Constructors

```java
public Ref(@Nonnull Store<ECS_TYPE> store)
```

Creates a `Ref` bound to the given store with no initial index assignment. The index is assigned later when the entity is placed into an archetype chunk.

```java
public Ref(@Nonnull Store<ECS_TYPE> store, int index)
```

Creates a `Ref` bound to the given store with a specific index.

## Methods

### Store Access

```java
@Nonnull
public Store<ECS_TYPE> getStore()
```

Returns the [Store](Store.md) that owns this entity.

### Index Access

```java
public int getIndex()
```

Returns the entity's current index within the store. This value changes when the entity moves between archetype chunks (e.g., when components are added or removed). Code that caches the index must be aware that it can become stale.

### Validation

```java
public void validate()
```

Asserts that this `Ref` is still valid. Throws `IllegalStateException` if the entity has been removed (i.e., the index has been set to `Integer.MIN_VALUE`). The exception includes the stored `Throwable` from the invalidation site, which aids debugging by showing where the entity was removed.

```java
public boolean isValid()
```

Returns `true` if this `Ref` still points to a live entity. Specifically, returns `this.index != Integer.MIN_VALUE`. Because the `index` field is `volatile`, this check is safe to call from any thread.

## Invalidation

When an entity is removed from a store via `Store.removeEntity()`, its `Ref` is invalidated by setting `index` to `Integer.MIN_VALUE`. The store also records a `Throwable` at the invalidation site so that subsequent calls to `validate()` can report where the removal happened.

Because `index` is `volatile`, invalidation is visible to all threads without additional synchronization. This is important because ECS events and async operations may hold references to entities that are removed on the store's owning thread.

**Pattern: Always check before use.** Any code that holds a `Ref` across tick boundaries or event dispatches should call `isValid()` before accessing components:

```java
if (ref.isValid()) {
    HealthComponent health = store.getComponent(ref, HEALTH_TYPE);
    // ... use health
}
```

Calling `store.getComponent()` on an invalidated `Ref` produces undefined behavior -- the index `Integer.MIN_VALUE` does not correspond to a valid slot.

## Identity

`Ref` uses reference equality semantics augmented by store identity and index:

- `equals()` returns `true` if and only if both the `store` and `index` are the same.
- `hashCode()` is cached for stable use in hash-based collections.

Two `Ref` instances pointing to the same store and index are considered equal, even if they are different object instances. This supports ECS internals that may create multiple `Ref` wrappers for the same entity.

## Related Types

- [Store](Store.md) -- the entity container that owns referenced entities
- [ComponentType](ComponentType.md) -- used with `Store.getComponent(ref, type)` to access entity data
- [ComponentRegistryProxy](ComponentRegistryProxy.md) -- registers the component types that `Ref` is used to access
- `Holder` -- snapshot container used during entity add/remove operations
- `Archetype` -- internal grouping; `Ref.index` points into archetype chunk storage
