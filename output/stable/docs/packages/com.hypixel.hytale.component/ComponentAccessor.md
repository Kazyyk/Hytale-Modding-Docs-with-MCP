---
title: "ComponentAccessor"
kind: "interface"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.ComponentAccessor"
api_surface: false
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
public interface ComponentAccessor<ECS_TYPE>
```

Unified interface for reading and mutating entity data and dispatching ECS events. Both [Store](Store.md) and [CommandBuffer](CommandBuffer.md) implement this interface, allowing systems to operate on either without knowing which one they are using.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Methods

```java
@Nullable
<T extends Component<ECS_TYPE>> T getComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

```java
@Nonnull
<T extends Component<ECS_TYPE>> T ensureAndGetComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

```java
@Nonnull
Archetype<ECS_TYPE> getArchetype(@Nonnull Ref<ECS_TYPE> ref)
```

```java
@Nonnull
<T extends Resource<ECS_TYPE>> T getResource(@Nonnull ResourceType<ECS_TYPE, T> resourceType)
```

```java
@Nonnull
ECS_TYPE getExternalData()
```

```java
<T extends Component<ECS_TYPE>> void putComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)
```

```java
<T extends Component<ECS_TYPE>> void addComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)
```

```java
<T extends Component<ECS_TYPE>> T addComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

```java
Ref<ECS_TYPE>[] addEntities(@Nonnull Holder<ECS_TYPE>[] holders, @Nonnull AddReason reason)
```

```java
@Nullable
Ref<ECS_TYPE> addEntity(@Nonnull Holder<ECS_TYPE> holder, @Nonnull AddReason reason)
```

```java
@Nonnull
Holder<ECS_TYPE> removeEntity(@Nonnull Ref<ECS_TYPE> ref, @Nonnull Holder<ECS_TYPE> target, @Nonnull RemoveReason reason)
```

```java
<T extends Component<ECS_TYPE>> void removeComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

```java
<T extends Component<ECS_TYPE>> void tryRemoveComponent(@Nonnull Ref<ECS_TYPE> ref, @Nonnull ComponentType<ECS_TYPE, T> componentType)
```

```java
<Event extends EcsEvent> void invoke(@Nonnull Ref<ECS_TYPE> ref, @Nonnull Event event)
```

Dispatches an entity-scoped ECS event.

```java
<Event extends EcsEvent> void invoke(@Nonnull EntityEventType<ECS_TYPE, Event> systemType, @Nonnull Ref<ECS_TYPE> ref, @Nonnull Event event)
```

Dispatches an entity-scoped event to a specific event type.

```java
<Event extends EcsEvent> void invoke(@Nonnull Event event)
```

Dispatches a world-scoped ECS event.

```java
<Event extends EcsEvent> void invoke(@Nonnull WorldEventType<ECS_TYPE, Event> systemType, @Nonnull Event event)
```

Dispatches a world-scoped event to a specific event type.

## Related Types

- [Store](Store.md) -- concrete implementation for direct store access
- [CommandBuffer](CommandBuffer.md) -- concrete implementation for deferred commands
