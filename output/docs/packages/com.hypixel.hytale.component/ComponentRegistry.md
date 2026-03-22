---
title: "ComponentRegistry"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.ComponentRegistry"
api_surface: true
extends: "java.lang.Object"
implements:
  - "IComponentRegistry<ECS_TYPE>"
generator_version: "2.0.0"
generated_at: "2026-03-21T02:46:37Z"
tags:
  - "ecs"
  - "component"
  - "core"
---

**Package:** `com.hypixel.hytale.component`

```java
public class ComponentRegistry<ECS_TYPE> implements IComponentRegistry<ECS_TYPE>
```

The central registry for the ECS framework. ComponentRegistry manages all type registrations (components, resources, systems, system types, system groups, event types) and maintains the immutable `Data` snapshot that stores use for runtime lookups. At approximately 1,662 lines, it is one of the largest classes in the ECS.

The registry maintains multiple stores and propagates registration changes to all of them. It uses a `StampedLock` for the data snapshot and a separate `ReadWriteLock` for data updates, enabling lock-free reads during normal operation.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Constructor

```java
public ComponentRegistry()
```

Initializes the registry and pre-registers the built-in component types (`UnknownComponents`, `NonTicking`, `NonSerialized`) and system types (`HolderSystem`, `RefSystem`, `RefChangeSystem`, `QuerySystem`, `TickingSystem`, `TickableSystem`, `RunWhenPausedSystem`, `ArchetypeTickingSystem`). Also starts a daemon thread for cleaning up garbage-collected [Holder](Holder.md) weak references.

## Registration Methods

```java
@Nonnull
public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)
```

Registers a non-serialized component type. Returns a [ComponentType](ComponentType.md) handle.

```java
@Nonnull
public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)
```

Registers a serialized component type with a string ID and codec.

```java
@Nonnull
public <T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull Supplier<T> supplier)
```

Registers a non-serialized resource type.

```java
@Nonnull
public <T extends Resource<ECS_TYPE>> ResourceType<ECS_TYPE, T> registerResource(@Nonnull Class<? super T> tClass, @Nonnull String id, @Nonnull BuilderCodec<T> codec)
```

Registers a serialized resource type.

```java
public <T extends ISystem<ECS_TYPE>> SystemType<ECS_TYPE, T> registerSystemType(@Nonnull Class<? super T> systemTypeClass)
```

Registers a new system type classification.

```java
@Nonnull
public <T extends EcsEvent> EntityEventType<ECS_TYPE, T> registerEntityEventType(@Nonnull Class<? super T> eventClass)
```

Registers an entity-scoped ECS event type.

```java
@Nonnull
public <T extends EcsEvent> WorldEventType<ECS_TYPE, T> registerWorldEventType(@Nonnull Class<? super T> eventClass)
```

Registers a world-scoped ECS event type.

```java
@Nonnull
public SystemGroup<ECS_TYPE> registerSystemGroup()
```

Registers a new system group for dependency ordering.

```java
public void registerSystem(@Nonnull ISystem<ECS_TYPE> system)
```

Registers a system instance. The system is added to the sorted execution order based on its dependencies and type.

## Built-in Type Accessors

```java
@Nonnull
public ComponentType<ECS_TYPE, UnknownComponents<ECS_TYPE>> getUnknownComponentType()
```

```java
@Nonnull
public ComponentType<ECS_TYPE, NonTicking<ECS_TYPE>> getNonTickingComponentType()
```

```java
@Nonnull
public ComponentType<ECS_TYPE, NonSerialized<ECS_TYPE>> getNonSerializedComponentType()
```

```java
@Nonnull
public SystemType<ECS_TYPE, TickingSystem<ECS_TYPE>> getTickingSystemType()
```

```java
@Nonnull
public SystemType<ECS_TYPE, TickableSystem<ECS_TYPE>> getTickableSystemType()
```

And similar accessors for `HolderSystem`, `RefSystem`, `RefChangeSystem`, `QuerySystem`, `RunWhenPausedSystem`, and `ArchetypeTickingSystem` system types.

## Lifecycle

```java
public void shutdown()
```

Shuts down the registry, interrupts the holder reference thread, and shuts down all stores in reverse order.

```java
public boolean isShutdown()
```

## Inner Classes

### Data

```java
public static class Data<ECS_TYPE>
```

An immutable snapshot of the registry state. Stores reference this snapshot for all runtime lookups (component IDs, codecs, system indexes, etc.). When the registry changes, a new Data snapshot is created and propagated to all stores.

## Related Types

- [IComponentRegistry](IComponentRegistry.md) -- the interface plugins use for registration
- [ComponentRegistryProxy](ComponentRegistryProxy.md) -- plugin-scoped proxy with auto-unregistration
- [Store](Store.md) -- created and managed by this registry
- [ComponentType](ComponentType.md) -- handle returned by component registration
- [ResourceType](ResourceType.md) -- handle returned by resource registration
- [SystemType](SystemType.md) -- handle returned by system type registration
- [SystemGroup](SystemGroup.md) -- handle returned by system group registration
