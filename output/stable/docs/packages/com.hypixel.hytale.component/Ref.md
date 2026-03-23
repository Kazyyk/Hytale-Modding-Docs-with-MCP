---
title: "Ref"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.Ref"
api_surface: true
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public class Ref<ECS_TYPE>
```

A lightweight entity reference handle. Ref is the primary way to identify and access an entity in a [Store](Store.md). It contains a volatile index into the store's internal arrays, enabling O(1) component lookups. Refs are created when entities are added and invalidated when entities are removed.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Fields

```java
public static final Ref<?>[] EMPTY_ARRAY = new Ref[0];
```

## Constructors

```java
public Ref(@Nonnull Store<ECS_TYPE> store)
```

Creates an uninitialized ref for the given store (index = `Integer.MIN_VALUE`).

```java
public Ref(@Nonnull Store<ECS_TYPE> store, int index)
```

Creates a ref with a specific index.

## Methods

```java
@Nonnull
public Store<ECS_TYPE> getStore()
```

Returns the store this ref belongs to.

```java
public int getIndex()
```

Returns the current index. `Integer.MIN_VALUE` means the ref is invalid.

```java
public boolean isValid()
```

Returns `true` if this ref points to a live entity.

```java
public void validate(@Nonnull Store<ECS_TYPE> store)
```

Throws `IllegalStateException` if the ref is invalid or belongs to a different store.

```java
public void validate()
```

Throws `IllegalStateException` if the ref is invalid.

## Related Types

- [Store](Store.md) -- the store that owns this ref
- [Holder](Holder.md) -- portable entity data container used when adding/removing entities
- [CommandBuffer](CommandBuffer.md) -- uses Ref to identify entities in deferred commands
- [WeakComponentReference](WeakComponentReference.md) -- a weak reference to a specific component on a specific entity
