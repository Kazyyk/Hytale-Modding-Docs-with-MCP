---
title: SystemType
kind: class
package: com.hypixel.hytale.component
api_surface: true
extends: ~
implements:
  - Comparable<SystemType<ECS_TYPE, ?>>
generator_version: "1.0.0"
generated_at: "2026-02-09T23:45:00Z"
tags:
  - ecs
  - system
  - type
  - registry
---

**Package:** `com.hypixel.hytale.component`

```java
public class SystemType<ECS_TYPE, T extends ISystem<ECS_TYPE>> implements Comparable<SystemType<ECS_TYPE, ?>>
```

A type-safe handle that identifies a specific ECS system within a `ComponentRegistry`. `SystemType` is the system-side counterpart to [ComponentType](ComponentType.md): where `ComponentType` identifies a component class, `SystemType` identifies a system class.

Each registered system receives a `SystemType` instance with a unique integer index within its registry. This index enables dense array-based lookup of systems during the tick pipeline.

`SystemType` instances are created by `ComponentRegistry` during system registration. Plugin code receives them from `ComponentRegistryProxy.registerSystem()` and uses them for system lookup and validation.

## Type Parameters

| Parameter | Description |
|---|---|
| `ECS_TYPE` | The store type this system operates on (`EntityStore` or `ChunkStore`) |
| `T` | The system class, bounded by `ISystem<ECS_TYPE>` |

## Static Fields

```java
@Nonnull
public static final SystemType[] EMPTY_ARRAY = new SystemType[0]
```

Shared empty array constant to avoid unnecessary allocations.

## Constructor

```java
protected SystemType(@Nonnull ComponentRegistry<ECS_TYPE> registry, @Nonnull Class<? super T> tClass, int index)
```

Creates a `SystemType` bound to the given registry with the specified class and index. This constructor is `protected` -- only `ComponentRegistry` and its subclasses create `SystemType` instances. Plugin code obtains them via `ComponentRegistryProxy.registerSystem()`.

## Methods

### Registry Access

```java
@Nonnull
public ComponentRegistry<ECS_TYPE> getRegistry()
```

Returns the `ComponentRegistry` that this system type belongs to. There is one `ComponentRegistry` per store type (`EntityStore.REGISTRY`, `ChunkStore.REGISTRY`).

### Type Class

```java
public Class<? super T> getTypeClass()
```

Returns the Java class that this system type represents. The `? super T` bound allows registration with a supertype class for polymorphic system access.

### Type Checking

```java
public boolean isType(@Nonnull ISystem<ECS_TYPE> system)
```

Returns `true` if the given system instance is assignable to this system type's class. Uses `Class.isAssignableFrom()` on the system's runtime class.

### Index

```java
public int getIndex()
```

Returns the numeric index assigned to this system type within its registry. The index is a dense, auto-incrementing integer starting from zero, assigned at registration time. It is used internally for array-indexed system storage and ordering.

### Validation

```java
public void validateRegistry(@Nonnull ComponentRegistry<ECS_TYPE> registry)
```

Asserts that this system type belongs to the given registry. Throws `IllegalArgumentException` if the registries do not match. This is a guard against accidentally using a system type from one registry with a different registry's store.

```java
public void validate()
```

Asserts that this system type has not been invalidated. Throws `IllegalStateException` if the system type was invalidated (e.g., due to plugin unload). Code that holds long-lived references to `SystemType` instances should call this before use.

```java
protected void invalidate()
```

Marks this system type as invalid. Called by the registry when a system is unregistered (e.g., during plugin shutdown). After invalidation, `validate()` will throw and `isValid()` will return `false`.

```java
protected boolean isValid()
```

Returns `true` if this system type has not been invalidated.

## Ordering

`SystemType` implements `Comparable<SystemType<ECS_TYPE, ?>>`. Ordering is by `getIndex()`, which provides a deterministic, registration-order sort. This ordering determines the default system execution order within the tick pipeline when no explicit dependency ordering is specified.

```java
public int compareTo(@Nonnull SystemType<ECS_TYPE, ?> o)
```

Compares this system type to another by index using `Integer.compare()`.

## Equality and Hashing

Two `SystemType` instances are equal when they have the same `index` and the same `registry`. This means system types from different registries are never equal, even if they have the same index.

## Lifecycle

`SystemType` follows a create-use-invalidate lifecycle:

1. **Creation:** `ComponentRegistry` creates a `SystemType` when a system is registered. The index is assigned sequentially.
2. **Usage:** Plugin code uses the `SystemType` to reference the system. The store's tick pipeline uses the index for efficient dispatch.
3. **Invalidation:** When a plugin is unloaded, its registered system types are invalidated. Any subsequent use of an invalidated `SystemType` will throw `IllegalStateException` via `validate()`.

This lifecycle mirrors [ComponentType](ComponentType.md), which has the same create-use-invalidate pattern.

## Related Types

- [ComponentType](ComponentType.md) -- the component-side counterpart; identifies component classes within a registry
- [Store](Store.md) -- the entity container that executes systems during its tick pipeline
- [ComponentRegistryProxy](ComponentRegistryProxy.md) -- plugin-scoped proxy for registering systems, which returns `SystemType` instances
- [PluginBase](PluginBase.md) -- provides `getEntityStoreRegistry()` and `getChunkStoreRegistry()`
- `ComponentRegistry` -- the underlying registry that stores all system types for a store type
- `ISystem` -- base interface for ECS systems; `T` is bounded by `ISystem<ECS_TYPE>`
- `EcsEvent` -- base class for ECS events; systems handle events dispatched through the store
- `SystemGroup` -- optional grouping mechanism for related systems
- `Dependency` -- declares execution ordering constraints between systems
- `DependencyGraph` -- resolves and sorts system execution order based on dependencies
