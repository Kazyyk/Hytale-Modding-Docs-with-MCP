---
title: "Holder"
kind: "class"
package: "com.hypixel.hytale.component"
fqcn: "com.hypixel.hytale.component.Holder"
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
public class Holder<ECS_TYPE>
```

A portable container for entity data. Holders are used when entities are added to or removed from a [Store](Store.md), and during serialization/deserialization. They hold an [Archetype](Archetype.md) and an array of [Component](Component.md) instances, protected by a `StampedLock` for thread safety.

Holders are pooled and reused by the registry via `newHolder()`.

## Type Parameters

- `ECS_TYPE` -- the store type parameter

## Methods

```java
public Archetype<ECS_TYPE> getArchetype()
```

```java
@Nullable
public <T extends Component<ECS_TYPE>> T getComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType)
```

```java
public <T extends Component<ECS_TYPE>> void addComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)
```

```java
public <T extends Component<ECS_TYPE>> void replaceComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)
```

```java
public <T extends Component<ECS_TYPE>> void putComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType, @Nonnull T component)
```

```java
public <T extends Component<ECS_TYPE>> void removeComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType)
```

```java
public <T extends Component<ECS_TYPE>> void ensureComponent(@Nonnull ComponentType<ECS_TYPE, T> componentType)
```

```java
@Nonnull
public Holder<ECS_TYPE> clone()
```

Deep-clones all components.

```java
public Holder<ECS_TYPE> cloneSerializable(@Nonnull ComponentRegistry.Data<ECS_TYPE> data)
```

Clones only serializable components, excluding `NonSerialized` entities.

```java
public boolean hasSerializableComponents(@Nonnull ComponentRegistry.Data<ECS_TYPE> data)
```

## Related Types

- [Ref](Ref.md) -- the in-store reference returned after adding a Holder
- [Store](Store.md) -- `addEntity()` and `removeEntity()` operate on Holders
- [Archetype](Archetype.md) -- defines the component shape of the Holder
