---
title: "IComponentRegistry"
kind: "interface"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.IComponentRegistry"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
---

**Package:** `com.hypixel.hytale.component`

```java
public interface IComponentRegistry<ECS_TYPE>
```

The plugin-facing interface for registering ECS types. Plugins interact with this interface (typically through [ComponentRegistryProxy](ComponentRegistryProxy.md)) rather than the concrete [ComponentRegistry](ComponentRegistry.md) directly. This decoupling allows plugin registrations to be automatically cleaned up on shutdown.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Methods

```java
@Nonnull
<T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)
```

Registers a non-serialized component type with a default supplier.

```java
@Nonnull
<T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)
```

Registers a serialized component type with a string ID and codec.

```java
@Nonnull
<T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)
```

Registers a non-serialized resource type.

```java
@Nonnull
<T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)
```

Registers a serialized resource type.

```java
<T extends ISystem<ECS_TYPE>> SystemType<ECS_TYPE, T> registerSystemType(@Nonnull Class<? super T> systemTypeClass)
```

Registers a system type classification.

```java
@Nonnull
<T extends EcsEvent> EntityEventType<ECS_TYPE, T> registerEntityEventType(@Nonnull Class<? super T> eventClass)
```

Registers an entity-scoped ECS event type.

```java
@Nonnull
<T extends EcsEvent> WorldEventType<ECS_TYPE, T> registerWorldEventType(@Nonnull Class<? super T> eventClass)
```

Registers a world-scoped ECS event type.

```java
@Nonnull
SystemGroup<ECS_TYPE> registerSystemGroup()
```

Registers a system group for dependency ordering.

```java
void registerSystem(@Nonnull ISystem<ECS_TYPE> system)
```

Registers a system instance.

```java
ResourceType<ECS_TYPE, SpatialResource<Ref<ECS_TYPE>, ECS_TYPE>> registerSpatialResource(@Nonnull Supplier<SpatialStructure<Ref<ECS_TYPE>>> supplier)
```

Registers a spatial resource backed by a `SpatialStructure` (e.g., KDTree).

## Related Types

- [ComponentRegistry](ComponentRegistry.md) -- the concrete implementation
- [ComponentRegistryProxy](ComponentRegistryProxy.md) -- plugin-scoped proxy wrapper
- [ComponentType](ComponentType.md) -- returned by component registration
- [ResourceType](ResourceType.md) -- returned by resource registration
- [SystemType](SystemType.md) -- returned by system type registration
